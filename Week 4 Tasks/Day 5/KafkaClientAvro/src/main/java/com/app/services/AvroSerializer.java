package com.app.services;

import java.io.ByteArrayOutputStream;
import java.util.Map;

import javax.xml.bind.DatatypeConverter;

import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.BinaryEncoder;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.specific.SpecificRecordBase;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Serializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AvroSerializer <T extends SpecificRecordBase> implements Serializer<T>
{

	private static final Logger LOGGER = LoggerFactory.getLogger(AvroSerializer.class);
	
	
	public AvroSerializer()
	{
		System.out.println("in avro serializer constructor");
	}
	
	
	@Override
	public void close()
	{
		//No Operation
	}
	
	
	@Override
	public void configure( Map<String, ?> arg0 , boolean arg1 )
	{
		// No Operation
	}
	
	
	@Override
	public byte[] serialize(String topic, T data) {
		
		try 
		{
		   byte[] result = null ;
		   
		   if(data != null)
		   {
			   LOGGER.debug("data={}" , data);
			   
			   ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			   
			   BinaryEncoder binaryEncoder = EncoderFactory.get().binaryEncoder(byteArrayOutputStream, null);
			   
			   DatumWriter<GenericRecord> datumWriter = new GenericDatumWriter<>(data.getSchema());
			   datumWriter.write(data, binaryEncoder);
			   
			   binaryEncoder.flush();
			   byteArrayOutputStream.close();
			   
			   result = byteArrayOutputStream.toByteArray();
			   LOGGER.debug("serialized data = '{}' " , DatatypeConverter.printHexBinary(result));
			   
		   }
		   
		   return result ;
		
		} catch (Exception e) {
			throw new SerializationException(
			    "Can't serialize data=" + data + "' for topic='" + topic + " "  , e );
		}
	
	}

}

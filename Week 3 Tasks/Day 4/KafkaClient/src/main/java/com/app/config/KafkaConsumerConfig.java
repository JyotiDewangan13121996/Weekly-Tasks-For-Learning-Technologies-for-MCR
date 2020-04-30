package com.app.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.OffsetResetStrategy;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

import com.app.services.KafkaConsumer;


@EnableKafka
@Configuration
public class KafkaConsumerConfig
{

	 @Bean
	    public ConsumerFactory<String, String> consumerFactory() {
	        Map<String, Object> props = new HashMap<>();
	        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
	        props.put(ConsumerConfig.GROUP_ID_CONFIG, "group_id");
	        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
	        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
	        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, true);
	        props.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, 1000);
	        props.put(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, 30000);
	        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
	     
	        
	        return new DefaultKafkaConsumerFactory<>(props);
	 }

	    @Bean
	    public ConcurrentKafkaListenerContainerFactory<String, String> kafkaListenerContainerFactory() {
	        ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<>();
	        factory.setConsumerFactory(consumerFactory());
	        return factory;
	    }
	    
	    @Bean
	    public KafkaConsumer consumer()
	    {
	    	return new KafkaConsumer();
	    }
}

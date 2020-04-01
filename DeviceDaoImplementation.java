package com.app.dao;

import com.app.pojos.Device;

import javax.persistence.*;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;


@Repository
public class DeviceDaoImplementation implements IDeviceDao
{
	@PersistenceContext
	private EntityManager entityManager ;
	
 
	// To switch on or switch off the power button of a device.

	@Override
	public boolean powerButton(Device device) 
	{
		if(device.isDeviceStatus())   // if device is powered on then switch it off
			return false ;
		else                        // if device is powered off then switch it on
			return true ;
	}

	
	// To get the status of the device .
	
	@Override
	public boolean getStatusOfDevice(Device device) 
	{
		return device.isDeviceStatus();
	}

	
	
	// To get the details of a device.
	
	@Override
	public Device getDetailsOfDevice(int deviceId) 
	{
		return entityManager.unwrap(Session.class).get(Device.class, deviceId);
	}

	
	// To reset the device into switch off mode.
	
	@Override
	public boolean resetDevice( Device device ) 
	{
		boolean status = false;
		
		if( device.isDeviceStatus() )
			status =false ;
		
		return status;
	}

	
	
	// To update the details of a device.
	
	@Override
	public Device updateDeviceDetails(Device updatedDevice)
	{
		entityManager.unwrap(Session.class).update(updatedDevice);
		return updatedDevice;
	}

}
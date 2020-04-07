package com.app.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IDeviceDao;
import com.app.pojos.Device;


@Service
@Transactional
public class DeviceServiceImplementation implements IDeviceService
{
	@Autowired
	private IDeviceDao deviceDao ;

	
	// Overridden method for power button of a device in service layer.
	@Override
	public boolean powerButton(Device device)
	{
		return deviceDao.powerButton(device) ;
	}

	
	// Overridden method for getting on of status of a device in service layer.
	
	@Override
	public boolean getStatusOfDevice(Device device)
	{
		return deviceDao.getStatusOfDevice(device);
	}

	
	// Overridden method for getting the details of the device in service layer.
	
	@Override
	public Device getDetailsOfDevice(int deviceId) 
	{
		return deviceDao.getDetailsOfDevice(deviceId);
	}

	
	// Overridden method for resetting the device in power off mode in service layer.
	
	@Override
	public boolean resetDevice(Device device)
	{
		return deviceDao.resetDevice(device);
	}

	
	// Overridden method for updating the details of the device in service layer.
	
	@Override
	public Device updateDeviceDetails(Device updatedDevice) 
	{
		return deviceDao.updateDeviceDetails(updatedDevice);
	}

}

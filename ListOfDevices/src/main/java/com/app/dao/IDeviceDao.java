package com.app.dao;

import com.app.pojos.Device;

public interface IDeviceDao 
{
  
	   boolean powerButton(Device device);  // to power on and power of the device.
	   
	   boolean getStatusOfDevice(Device device);  // to get the on or off power status of the device.
	   
	   Device getDetailsOfDevice(int deviceId);  // to get the details of the device.
	   
	   boolean resetDevice(Device device);  // to reset the device to off mode .
	   
	   Device updateDeviceDetails(Device updatedDevice);  // to update the details of the device
}
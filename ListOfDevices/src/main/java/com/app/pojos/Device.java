package com.app.pojos;

import javax.persistence.*;


import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "device")
public class Device 
{
	private Integer serialNo ;
	private String deviceName ;
	private String deviceType ;
	private String modelName ;
	private Integer modelNo ;
	private String modelDescription ;
	private String productDescription ;
	private boolean deviceStatus;
	
	private ListOfDevices listOfDevices ;
	private Manufacturer manufacturer ;
	
	
	// default constructor of Device.
	public Device() 
	{
		System.out.println("in default constructor of Device");
	}


	// parameterize constructor of Device  using fields .
	
	public Device(String deviceName, String deviceType, String modelName, Integer modelNo, String modelDescription,
			String productDescription, boolean deviceStatus) {
		super();
		this.deviceName = deviceName;
		this.deviceType = deviceType;
		this.modelName = modelName;
		this.modelNo = modelNo;
		this.modelDescription = modelDescription;
		this.productDescription = productDescription;
		this.deviceStatus = deviceStatus;
	}
	
	// Getters and Setters .

	//getter and setter for serial no .
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "serialNo")
	public Integer getSerialNo() {
		return serialNo;
	}



	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}


	//getter and setter for device name .
	
	@Column(name = "deviceName" , length = 20 , nullable = false)
	public String getDeviceName() {
		return deviceName;
	}


	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}


	//getter and setter for device type.
	
	@Column(name = "deviceType" , length = 20 )
	public String getDeviceType() {
		return deviceType;
	}


	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}


	
	//getter and setter for model name of device .
	@Column(name = "modelName" , length = 20)
	public String getModelName() {
		return modelName;
	}


	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	
	//getter and setter for model no of device .
	@Column(name = "modelNo" , nullable = false)

	public Integer getModelNo() {
		return modelNo;
	}


	public void setModelNo(Integer modelNo) {
		this.modelNo = modelNo;
	}


	
	//getter and setter for model description of the device .
	@Column(name = "modelDescription" , length = 50)
	public String getModelDescription() {
		return modelDescription;
	}


	public void setModelDescription(String modelDescription) {
		this.modelDescription = modelDescription;
	}


	//getter and setter for product description of the device.
	@Column(name = "productDescription" , length = 50)
	public String getProductDescription() {
		return productDescription;
	}


	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	

	// getter and setter for device status .
	
	public boolean isDeviceStatus() {
		return deviceStatus;
	}


	public void setDeviceStatus(boolean deviceStatus) {
		this.deviceStatus = deviceStatus;
	}
	
	
   // getter and setter for list of devices .
	
	@ManyToOne
	@JoinColumn(name = "deviceId")
	@JsonIgnore
	public ListOfDevices getListOfDevices() {
		return listOfDevices;
	}


	public void setListOfDevices(ListOfDevices listOfDevices) {
		this.listOfDevices = listOfDevices;
	}

	
    // getter and setter for manufacturer of the device  .
	@OneToOne(mappedBy = "device" , cascade = CascadeType.ALL , orphanRemoval = true)
	@JsonIgnore
	public Manufacturer getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	
	
	
	
	// Overriding the toString() method of Device class to display the record.


	@Override
	public String toString() {
		return "Device [deviceName=" + deviceName + ", deviceType=" + deviceType + ", modelName=" + modelName
				+ ", modelNo=" + modelNo + ", modelDescription=" + modelDescription + ", productDescription="
				+ productDescription + ", deviceStatus=" + deviceStatus + ", listOfDevices=" + listOfDevices
				+ ", manufacturer=" + manufacturer + "]";
	}
	
	
	// Helper Methods .
	
	// To add manufacturer details .

	public void addManufacturerDetails(Manufacturer manufacturerDetails ) 
	{
	  	this.manufacturer = manufacturerDetails ;
	  	manufacturerDetails.setDevice(this);
	}
	
	
	//To remove manufacturer details .
	
	public void removeManufacturerDetails(Manufacturer manufacturerDetails) 
	{
	  this.manufacturer = null ;
	  manufacturerDetails.setDevice(null);
	  
	}
	
	

}
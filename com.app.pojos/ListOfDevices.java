package com.app.pojos;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "list_of_devices")
public class ListOfDevices
{
	
	//private Integer serialNo ; 
	private String category ; 
	private Integer deviceId ;
	private List<Device> devices = new ArrayList<>();
	
	// default constructor of ListOfDevices
	public ListOfDevices() 
	{
		System.out.println("in default constructor of ListOfDevices");
	}
	
	 
	// parameterized constructor using field .

	public ListOfDevices(String category, Integer deviceId) {
		super();
		this.category = category;
		this.deviceId = deviceId;
	}


	// Getters  and setters .

	
	// getter & setter for serialNo
	
	/*
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "serialNo")
	public Integer getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}

     */
	
	
	// getter & setter for deviceId
	   
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   @Column(name = "deviceId")
		//@Column(name = "deviceId" , unique = true , nullable = false)
		public Integer getDeviceId() {
			return deviceId;
		}

		public void setDeviceId(Integer deviceId) {
			this.deviceId = deviceId;
		}
	
	
	// getter & setter for category
	@Column(name = "category" , length = 40 , nullable = false)
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}



	
   // getter & setter for list of devices .

@OneToMany(mappedBy = "listOfDevices" , cascade = CascadeType.ALL , orphanRemoval = true)
@JsonIgnore	
public List<Device> getDevices() {
		return devices;
	}


	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}
	

	// Overridden toString() method of the ListOfDevices class to display the record.
	@Override
	public String toString() {
		return "ListOfDevices [ category=" + category + ", deviceId=" + deviceId + "]";
	}


	// Helper Methods .
	
	// To add a device in the list .
	
	public void addDevice(Device device)
	{
		 devices.add(device) ;
		 device.setListOfDevices(this);
	}

	
	//To remove a device in the list .
	
	public void removeDevice(Device device)
	{
		devices.remove(device);
		device.setListOfDevices(null);
	}
	

	
	
	

}

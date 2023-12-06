package com.te.cars.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "car")
public class CarsInfo implements Serializable{

	@Id
	@Column(name = "Id")
	private Integer id;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Company")
	private String company;
	
	@Column(name = "Fuel_Type")
	private String fuelType;
	
	@Column(name = "Power Steering")
	private boolean powerSteering;
	
	@Column(name = "Break_System")
	private String breakSystem;
	
	@Column(name = "Showroom_Price")
	private Double showroomPrice;
	
	@Column(name = "Onroad_Price")
	private Double onroadPrice;
	
	@Column(name = "Image_URL")
	private String imageURL;
	
	@Column(name = "Mileage")
	private Double mileage;
	
	@Column(name = "Seating_Capacity")
	private Integer seatingCapacity;
	
	@Column(name = "Engine_Capacity")
	private Integer engineCapacity;
	
	@Column(name = "Gear_Type")
	private String gearType;
}

package com.zensar;

public class Vehicle {
	private String vehicle_registration_number;
	private String vehicle_name;
	private double cost_of_Vehicle;

	public Vehicle() {
		super();
	}
	public Vehicle(String vehicle_registration_number, String vehicle_name, double cost_of_Vehicle) {
		super();
		this.vehicle_registration_number = vehicle_registration_number;
		this.vehicle_name = vehicle_name;
		this.cost_of_Vehicle = cost_of_Vehicle;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicle_registration_number=" + vehicle_registration_number + ", vehicle_name=" + vehicle_name
				+ ", cost_of_Vehicle=" + cost_of_Vehicle + "]";
	}
	public String getVehicle_registration_number() {
		return vehicle_registration_number;
	}
	public void setVehicle_registration_number(String vehicle_registration_number) {
		this.vehicle_registration_number = vehicle_registration_number;
	}
	public String getVehicle_name() {
		return vehicle_name;
	}
	public void setVehicle_name(String vehicle_name) {
		this.vehicle_name = vehicle_name;
	}
	public double getCost_of_Vehicle() {
		return cost_of_Vehicle;
	}
	public void setCost_of_Vehicle(double cost_of_Vehicle) {
		this.cost_of_Vehicle = cost_of_Vehicle;
	}
	
	

}

package com.practiceOops.java;

public class InheritanceDemo {

	public static void main(String[] args) {
		
		MountainBike mountainBike = new MountainBike(20, 10, 1);
		
		System.out.println("Gear si : "+ mountainBike.gear);
		System.out.println("Seat height is : "+ mountainBike.seatHeight);
		System.out.println("Bike speed is : " + mountainBike.speed);
		mountainBike.applyBrake(1);
		System.out.println("bike speed after applying brake is : " + mountainBike.speed);
	}
}

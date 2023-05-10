package com.practiceOops.java;

public class MountainBike extends Bicycle{
	public int seatHeight;
	public MountainBike(int startHeight,
			int startSpeed, int startGear) {
		
//		initialize base class constructor using super method 
//		Super keyword should be the very first while inheriting otherwise java will not recognize
		super(startSpeed, startGear);
		seatHeight = startHeight;
	}
	public void setHeight(int newValue) {
		
	}
		
}

package com.dacia.mea;

public abstract class Vehicle {

	private int noOfPasseger;
	private String color;
	private String madeIn;
	private String name;
	private int maxSpeed;

	abstract void isMoving();
	
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getNoOfPasseger() {
		return noOfPasseger;
	}

	public void setNoOfPasseger(int noOfPasseger) {
		this.noOfPasseger = noOfPasseger;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMadeIn() {
		return madeIn;
	}

	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

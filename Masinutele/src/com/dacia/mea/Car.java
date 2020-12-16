package com.dacia.mea;

import enums.CarType;

public class Car extends LandVehicle {

	private CarType tipulMasinei;
	private int numarGeamuri;
	private String modelul;
	private boolean isSpinning;
	private final int numberOfDoors = 2;// la asta m am gandit sa il pun intr-un constructor al clasei..poate merge :D
	// sa il pot afisa in main
	final static int NUMBER_OF_CHAIR = 5;
	private int maxSpeed;
	
	static void isFaster(Car car1, Car car2) {
		if (car1.getMaxSpeed() > car2.getMaxSpeed())
			System.out.println();
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public int getMaxSpeed() {
		return this.maxSpeed;
	}

	public void setMaxSpeed(int viteza) {
		this.maxSpeed = viteza;
	}

	public CarType getType() {
		return tipulMasinei;
	}

	public void setType(CarType y) {
		this.tipulMasinei = y;
	}

	public int getNumarGeamuri() {
		System.out.println("are   " + numarGeamuri + "    ....");

		return numarGeamuri;
	}

	public void setNumarGeamuri(int a) {
		this.numarGeamuri = a;
	}

	public String getModelul() {
		System.out.println("modelul este " + modelul);
		return this.modelul;
	}

	public void setModelul(String model) {
		this.modelul = model;

	}

	public boolean getIsSpinning() {
		return isSpinning;
	}

	public void setIsSpinning(boolean invarte) {
		this.isSpinning = invarte;
	}

	public Car() {
		this.tipulMasinei = CarType.MANUAL;
	}

	public Car(boolean isSpinning, int numarGeamuri, String modelul) {
		this.isSpinning = isSpinning;
		this.numarGeamuri = numarGeamuri;
		this.modelul = modelul;
	}

	public Car(boolean isSpinning, int numarGeamuri) {
		this.isSpinning = isSpinning;
		this.numarGeamuri = numarGeamuri;
	}

	public Car(String modelul) {
		System.out.println("Modelul este" + this.modelul);
	}

	public Car(int numarGeamuri, String modelul, boolean isSpinning) {
		this(isSpinning, numarGeamuri);
		this.numarGeamuri = numarGeamuri;
		this.modelul = modelul;

	}

	public void afiseazaDetalii() {
		System.out.println("Numar geamuri  " + this.numarGeamuri);
		System.out.println("Numele modelului  " + this.modelul);
		System.out.println("Se tureaza     (asta este cel predefinit)   " + this.isSpinning);
	}

	public void masinaSeMisca(boolean isSpinning) {
		if (isSpinning = true) {
			System.out.println("Masina se misca");
		} else {
			System.out.println("Masina sta");
		}
	}

	public void numeleMarcii() {
		this.modelul = "Audi";

	}

}

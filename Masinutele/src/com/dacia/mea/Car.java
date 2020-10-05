package com.dacia.mea;

public class Car {

	private CarType tipulMasinei;
	private int numarGeamuri;
	private String modelul;
	private boolean isSpinning;

	public  CarType getType() {
		return tipulMasinei;
	}
	
	
	public Car() {
		this.tipulMasinei=CarType.MANUAL;
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

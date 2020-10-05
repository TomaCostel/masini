package com.dacia.mea;

public class Car {

	CarType tipulMasinei;
	int numarGeamuri;
	String modelul;
	boolean isSpinning;

	Car() {
		this.tipulMasinei=CarType.MANUAL;
	}

	Car(boolean isSpinning, int numarGeamuri, String modelul) {
		this.isSpinning = isSpinning;
		this.numarGeamuri = numarGeamuri;
		this.modelul = modelul;
	}

	Car(boolean isSpinning, int numarGeamuri) {
		this.isSpinning = isSpinning;
		this.numarGeamuri = numarGeamuri;
	}

	Car(String modelul) {
		System.out.println("Modelul este" + this.modelul);
	}

	Car(int numarGeamuri, String modelul, boolean isSpinning) {
		this(isSpinning, numarGeamuri);
		this.numarGeamuri = numarGeamuri;
		this.modelul = modelul;

	}

	void afiseazaDetalii() {
		System.out.println("Numar geamuri  " + this.numarGeamuri);
		System.out.println("Numele modelului  " + this.modelul);
		System.out.println("Se tureaza     (asta este cel predefinit)   " + this.isSpinning);
	}

	void masinaSeMisca(boolean isSpinning) {
		if (isSpinning = true) {
			System.out.println("Masina se misca");
		} else {
			System.out.println("Masina sta");
		}
	}

	void numeleMarcii() {
		this.modelul = "Audi";
	}

}

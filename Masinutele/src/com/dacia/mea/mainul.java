package com.dacia.mea;

public class mainul {

	static void comparareSpiner(Car mas1, Car mas2) {
		if (mas1.isSpinning = true) {
			mas1.afiseazaDetalii();
		} else if (mas2.isSpinning = true) {
			mas2.afiseazaDetalii();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car autovehicul = new Car();// aici mi-a dat eroare prima data pentru ca nu am specificat ce tip de
									// variabila este in paranteza si in car.java nu aveam constructor asa..

		Car masina = new Car(6, "nissan", false);
		Car masina3 = new Car(false, 4);
		Car masina4 = new Car("maybach");
		autovehicul.numeleMarcii();
		autovehicul.masinaSeMisca(true);
		autovehicul.afiseazaDetalii();
		masina.numeleMarcii();
		masina.masinaSeMisca(false);
		masina.afiseazaDetalii();
		masina3.numeleMarcii();
		
		masina4.afiseazaDetalii();
		
		comparareSpiner(autovehicul,masina3);
	}

}

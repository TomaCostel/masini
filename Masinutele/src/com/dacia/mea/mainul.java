package com.dacia.mea;

import static com.dacia.mea.Car.NUMBER_OF_CHAIR;

import java.util.ArrayList;

public class mainul {

	static void comparareSpiner(Car mas1, Car mas2) {
		if (mas1.getIsSpinning() == true) {
			mas1.afiseazaDetalii();
		} else if (mas2.getIsSpinning() == true) {
			mas2.afiseazaDetalii();
		}
	}

	static void isFaster(Car car1, Car car2) {
		if (car1.getMaxSpeed() > car2.getMaxSpeed())
			System.out.println();
	}

	public static void main(String[] args) {
		ArrayList<Boat> listaB = new ArrayList<Boat>();
		ArrayList<Car> listaM = new ArrayList<Car>();
		Car masina9 = new Car(6, "nissan", false);
		Boat barca = new Boat();
		barca.setMaxSpeed(90);
		masina9.setMaxSpeed(90);
		barca.setName("Sakura");
		masina9.setName("Suzuki");
		listaB.add(barca);
		listaM.add(masina9);
		
		Util.findMaxSpeedVehicle(listaB, listaM);
/*
		Car autovehicul = new Car();

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

		Car masina5 = new Car(false, 4, "Logan");
		Car masina6 = new Car(true, 5, "Maibach");
		Car masina7 = new Car();
		masina7.setIsSpinning(true);
		masina5.setMaxSpeed(200);
		masina6.setMaxSpeed(120);
		System.out.println(masina5.getNumberOfDoors());
		comparareSpiner(autovehicul, masina3);
		System.out.println(NUMBER_OF_CHAIR);
		// System.out.println(numberOfDoors);
*/
	}

}

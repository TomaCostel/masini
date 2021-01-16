package com.dacia.mea;

import java.util.ArrayList;
import java.util.Scanner;

public class Util {

	public static Vehicle showBiggestSpeed(ArrayList<Vehicle> listaMasini)throws ArrayIndexOutOfBoundsException {
		int max = 0;

		Vehicle maxVehicle = listaMasini.get(0);

		for (Vehicle masina : listaMasini) {
			if (maxVehicle.getMaxSpeed() < masina.getMaxSpeed()) {
				maxVehicle = masina;
			}
		}
		System.out
				.println("viteza max este=" + maxVehicle.getMaxSpeed() + "si masina se numeste" + maxVehicle.getName());
		return maxVehicle;
	}

	public static int getNumberOfCarsWithMaxSpeed(ArrayList<Vehicle> listaMasini) {

		int max = 0;
		int count = 1;
		for (Vehicle masina : listaMasini) {
			if (max < masina.getMaxSpeed()) {
				// masina cu max nou mai mare
				max = masina.getMaxSpeed();
				count = 1;

			} else {
				if (max == masina.getMaxSpeed()) {
					count++;
				}
			}

		}

		return count;

	}

	public static Vehicle findMaxSpeedVehicle(ArrayList<Boat> listaBarci, ArrayList<Car> listaMasini) throws Exception {
		ArrayList<Vehicle> listaVehicule = new ArrayList<Vehicle>();
		listaVehicule.addAll(listaBarci);
		listaVehicule.addAll(listaMasini);
		int a = Util.getNumberOfCarsWithMaxSpeed(listaVehicule);
		if (a == 1) {

			Vehicle masina = Util.showBiggestSpeed(listaVehicule);

			ArrayList<Vehicle> listaVehicule2 = new ArrayList<Vehicle>();
			listaVehicule2.addAll(listaMasini);
			System.out.println(masina instanceof Car);

			if (masina instanceof Boat) {
				System.out.println(masina.getMaxSpeed());
				System.out.println(masina.getName());
				Util.showBiggestSpeed(listaVehicule2);
			}
		} else if (a == 2) {
			Vehicle masina = Util.showBiggestSpeed(listaVehicule);
			int vitezaMaxima = masina.getMaxSpeed();
			for (Vehicle v : listaVehicule) {

				if (v.getMaxSpeed() == vitezaMaxima) {
					System.out.println(masina.getMaxSpeed());
					System.out.println(masina.getName());
				}
			}
		} else if (a == 3) {
			throw new Exception("Exista 3 vehicule cu aceeasi viteza ");
		}
		return null;
	}

	public static void cautaVitezaMaxima(ArrayList<Boat> listaBarci, ArrayList<Car> listaMasini) throws Exception {
		ArrayList<Vehicle> listaMasini2 = new ArrayList<Vehicle>();
		listaMasini2.addAll(listaBarci);
		listaMasini2.addAll(listaMasini);
		int a = Util.getNumberOfCarsWithMaxSpeed(listaMasini2);
		if (a == 1) {

			Vehicle masina = Util.showBiggestSpeed(listaMasini2);

			ArrayList<Vehicle> listaVehicule2 = new ArrayList<Vehicle>();
			listaVehicule2.addAll(listaMasini);
			System.out.println(masina instanceof Car);

			if (masina instanceof Boat) {
				System.out.println(masina.getMaxSpeed());
				System.out.println(masina.getName());
				Util.showBiggestSpeed(listaVehicule2);
			}
		} else if (a == 2) {
			Vehicle masina = Util.showBiggestSpeed(listaMasini2);
			int vitezaMaxima = masina.getMaxSpeed();
			for (Vehicle v : listaMasini2) {

				if (v.getMaxSpeed() == vitezaMaxima) {
					System.out.println(masina.getMaxSpeed());
					System.out.println(masina.getName());
				}
			}
		} else if (a == 3) {
			throw new Exception("Exista 3 vehicule cu aceeasi viteza ");
		}

	}

	public static void afisareCaracteristiciObiect(ArrayList<Vehicle> listaMasini) {
		System.out.println("Care este numaru obiectului din lista caruia doresti sa ii vezi caracteristicile ");
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		Vehicle masina4 = new Car();
		try {
			masina4 = listaMasini.get(b);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Indexul introdus nu exista");
			System.out.println("Avem atatea elemente >>>>>>" + listaMasini.size());
		} catch (Exception r) {
			r.printStackTrace();
			System.out.println("A aparut o exceptie neprevazuta");
		}
		if (masina4 != null) {

			System.out.println(masina4.getColor());
			System.out.println(masina4.getMaxSpeed());
			System.out.println(masina4.getName());
		}
	}
	
	
	
}

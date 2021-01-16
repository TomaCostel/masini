package com.dacia.mea;

import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionExcercises {

	public static int calculImpartire() throws NumberFormatException, ArithmeticException {

		int e;

		System.out.println("Introduceti primul numar");
		Scanner a = new Scanner(System.in);
		String l = a.next();
		System.out.println("Introduceti primul numar ");
		Scanner h = new Scanner(System.in);
		String m = h.next();

		e = Integer.valueOf(l) / Integer.valueOf(m);
		System.out.println("Final de rezultat");
		return e;
	}

	public static void exersareExceptii() throws NumberFormatException, ArithmeticException {
		System.out.println("Sa exersam exceptiile");
		calculImpartire();

	}

	public static void ecercitii(ArrayList<Car> listaMasini) throws ArrayIndexOutOfBoundsException {
		System.out.println("Introduceti indexul");
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		int counter = 0;

		for (Car c : listaMasini) {

			if (counter == b) {
				Car c1 = listaMasini.get(counter);
				System.out.println(c1.getModelul());
				break;

			}
			counter++;

		}

	}

	public static void exercitiSubiectul4(ArrayList<Car> listaMasini) {
		try {
			calculImpartire();
			ecercitii(listaMasini);
		} catch (NumberFormatException e) {
			System.out.println("Numerele introduse nu sunt corecte");
		} catch (ArithmeticException e) {
			System.out.println("Rezultatul este 0");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("indexul introdus nu exista");
		}

	}
}

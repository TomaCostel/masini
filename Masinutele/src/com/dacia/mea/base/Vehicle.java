package com.dacia.mea.base;

public class Vehicle {

	private int numarRoti;
	private double diametru;
	private boolean trebuiePermis;
	
	
	public double getDiametru() {
		return diametru;
	}

	public void setDiametru(double diametru) {
		this.diametru = diametru;
	}

	public boolean isTrebuiePermis() {
		return trebuiePermis;
	}

	public void setTrebuiePermis(boolean trebuiePermis) {
		this.trebuiePermis = trebuiePermis;
	}

	public int getNumarRoti() {
		return this.numarRoti;
	}
	
	public void setNumarRoti(int numarRoti) {
		this.numarRoti=numarRoti;
	}
	
	
	
	
}

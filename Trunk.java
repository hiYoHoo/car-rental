package com.dada;

public class Trunk extends Car {
	public Trunk(int index, String name, int rental, int cargonum){
		this.index = index;
		this.name = name;
		this.rental = rental;
		this.cargoNum = cargonum;
	}
	public void info(){
		System.out.println(this.index + "\t" + this.name + "\t" + this.rental + "Ôª/Ìì" + "\t\t" + "ÔØ»õ£º" + this.cargoNum + "¶Ö");
	}
}

package com.dada;

public class Passenger extends Car {
	public Passenger(int index, String name, int rental, int peoplenum){
		this.index = index;
		this.name = name;
		this.rental = rental;
		this.peopleNum = peoplenum;
	}
	public void info(){
		System.out.println(this.index + "\t" + this.name + "\t" + this.rental + "Ԫ/��" + "\t\t" + "���ˣ�" + this.peopleNum + "��");
	}
}

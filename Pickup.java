package com.dada;

public class Pickup extends Car {
	public Pickup(int index, String name, int rental, int peoplenum, int cargonum){
		this.index = index;
		this.name = name;
		this.rental = rental;
		this.peopleNum = peoplenum;
		this.cargoNum = cargonum;
	}
	public void info(){
		System.out.println(this.index + "\t" + this.name + "\t" + this.rental + "Ԫ/��" + "\t\t" + "���ˣ�" + this.peopleNum + "��" + " �ػ���" + this.cargoNum + "��");
	}
}

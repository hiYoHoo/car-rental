package com.dada;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		
		Car[] allCar = {
				new Passenger(1,"奥迪A4",500,4),
				new Passenger(2,"马自达6",400,4),
				new Pickup(3,"皮卡雪6",450,4,2),
				new Passenger(4,"金龙",800,20),
				new Trunk(5,"松花江",400,4),
				new Trunk(6,"依维柯",1000,20)
		};
		
		System.out.println("欢迎使用答答租车系统：");
		System.out.println("您是否要租车：1是 0否");

		String isrent = input.next();
		if(!isrent.equals("1")){
			return;
		}
		
		System.out.println("您可租车的类型及价目表：");
		System.out.println("序号\t汽车名称\t租金\t\t容量");
		for(Car car : allCar){
			car.info();
		}
		
		System.out.println("请输入您要租车的数量：");
		int rentNum = input.nextInt();//租车数量
		int[] carIndex = new int[rentNum];//租车序号
		Car[] selectedCar = new Car[rentNum];//租车数组
		for(int i=0; i<rentNum; i++){
			System.out.println("请输入第" + (i+1) +"辆车的序号:");
			carIndex[i] = input.nextInt();
			selectedCar[i] = allCar[carIndex[i]-1];
		}
		
		System.out.println("请输入租车天数：");
		int rentDay = input.nextInt();//租车天数
		int pNum = 0;//载人数量
		int cNum = 0;//载货数量
		System.out.println("您的帐单");
		System.out.println("***载人的车有：");
		for(Car car : selectedCar){
			if(car.peopleNum != 0){
				pNum += car.peopleNum;
				System.out.print(car.name + " ");
			}
		}
		System.out.println("共载人" + pNum + "人");
		System.out.println("***载货的车有：");
		for(Car car : selectedCar){
			if(car.cargoNum != 0){
				cNum += car.cargoNum;
				System.out.print(car.name + " ");
			}
		}
		System.out.println("共载货物" + cNum + "吨");
		
		int price = 0;
		for(Car car : selectedCar){
			price += car.rental * rentDay;
		}
		System.out.println("***租车总价格：" + price + "元");	
	}
	
}

package com.dada;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner input = new Scanner(System.in);
		
		Car[] allCar = {
				new Passenger(1,"�µ�A4",500,4),
				new Passenger(2,"���Դ�6",400,4),
				new Pickup(3,"Ƥ��ѩ6",450,4,2),
				new Passenger(4,"����",800,20),
				new Trunk(5,"�ɻ���",400,4),
				new Trunk(6,"��ά��",1000,20)
		};
		
		System.out.println("��ӭʹ�ô���⳵ϵͳ��");
		System.out.println("���Ƿ�Ҫ�⳵��1�� 0��");

		String isrent = input.next();
		if(!isrent.equals("1")){
			return;
		}
		
		System.out.println("�����⳵�����ͼ���Ŀ��");
		System.out.println("���\t��������\t���\t\t����");
		for(Car car : allCar){
			car.info();
		}
		
		System.out.println("��������Ҫ�⳵��������");
		int rentNum = input.nextInt();//�⳵����
		int[] carIndex = new int[rentNum];//�⳵���
		Car[] selectedCar = new Car[rentNum];//�⳵����
		for(int i=0; i<rentNum; i++){
			System.out.println("�������" + (i+1) +"���������:");
			carIndex[i] = input.nextInt();
			selectedCar[i] = allCar[carIndex[i]-1];
		}
		
		System.out.println("�������⳵������");
		int rentDay = input.nextInt();//�⳵����
		int pNum = 0;//��������
		int cNum = 0;//�ػ�����
		System.out.println("�����ʵ�");
		System.out.println("***���˵ĳ��У�");
		for(Car car : selectedCar){
			if(car.peopleNum != 0){
				pNum += car.peopleNum;
				System.out.print(car.name + " ");
			}
		}
		System.out.println("������" + pNum + "��");
		System.out.println("***�ػ��ĳ��У�");
		for(Car car : selectedCar){
			if(car.cargoNum != 0){
				cNum += car.cargoNum;
				System.out.print(car.name + " ");
			}
		}
		System.out.println("���ػ���" + cNum + "��");
		
		int price = 0;
		for(Car car : selectedCar){
			price += car.rental * rentDay;
		}
		System.out.println("***�⳵�ܼ۸�" + price + "Ԫ");	
	}
	
}

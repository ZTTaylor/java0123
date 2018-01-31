package java0123;
import Diaoyong.I3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Diaoyong.Car;
import Diaoyong.Cat;


import Diaoyong.Mainboard;
import Diaoyong.Small;
import Diaoyong.piao;

public class Text {

	public static void main(String[] args) {
//		Car car1=new Car("保时捷", "轿车", 200000, 5);
//		Car car2=new Car();
//		car2.setMoney(10000);
//		car2.setType("货车");
//		car2.setName("大运");
//		System.out.println(car1.getName());
//		System.out.println(car2.getName());
//		//Cat.jintai();
//		//System.out.println(Cat.kkk);
//		Small Small1=new Small("qq","小轿车",200,4);
//		Small1.volume();
//		Car x=new Car();
//		x.volume();
//		System.out.println(Small1.getName());
////		Interger a=22;
////		interger b=22;
//		Small1.oil();
//		Small1.BYwheel();
//		Mainboard mainboard=new Mainboard();
//		I3 i3=new I3();
//		mainboard.setI5(i3);
//		mainboard.method();
//		int[] shuzu1= {1,2,3,4,5,5,5,5,9};
//		int[] shuzu2=new int[5];
//		for(int i=0;i<shuzu1.length;i++) {
//			System.out.print(shuzu1[i]+",");
//		}
//		System.out.println();
//		System.out.println(shuzu2.length);
//	    List jihe=new ArrayList();
//	    jihe.add(1);
//	    System.out.println(jihe.size());
		
		
		
		
		//获取控制台的输入
//		Scanner scanner=new Scanner(System.in);
//		String str=scanner.next();
//		int b=Integer.parseInt(str);
//		int a=12;
//		System.out.println("接受的内容str1: "+(b+a));
//	
//		int str2=scanner.nextInt();
//		
//		System.out.println("接受的内容2int:"+str2+a);
		
		
//		I3<Integer> i3=new I3();

	
		
		Runnable piaop=new piao();
		Thread m1=new Thread(piaop);
		Thread m2=new Thread(piaop);
		m1.start();                //shuiji
		m2.start();

	}
}

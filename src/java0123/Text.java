package java0123;
import Diaoyong.I3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Diaoyong.Car;
import Diaoyong.Cat;


import Diaoyong.Mainboard;
import Diaoyong.Small;
import Diaoyong.piao;

public class Text {

	public static void main(String[] args) throws IOException {
//		Car car1=new Car("��ʱ��", "�γ�", 200000, 5);
//		Car car2=new Car();
//		car2.setMoney(10000);
//		car2.setType("����");
//		car2.setName("����");
//		System.out.println(car1.getName());
//		System.out.println(car2.getName());
//		//Cat.jintai();
//		//System.out.println(Cat.kkk);
//		Small Small1=new Small("qq","С�γ�",200,4);
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
		
		
		
		
		//��ȡ����̨������
//		Scanner scanner=new Scanner(System.in);
//		String str=scanner.next();
//		int b=Integer.parseInt(str);
//		int a=12;
//		System.out.println("���ܵ�����str1: "+(b+a));
//	
//		int str2=scanner.nextInt();
//		
//		System.out.println("���ܵ�����2int:"+str2+a);
		
		
//		I3<Integer> i3=new I3();

	
		
//		Runnable piaop=new piao();
//		Thread m1=new Thread(piaop);
//		Thread m2=new Thread(piaop);
//		m1.start();                //shuiji
//		m2.start();
		
		File file=new File("E:\\�γ���Ƶ�빤��ke\\��Ƶ��ʼ�\\2018-01-30\\��Ƶ\\�쳣����4.wmv");
		File file2=new File("E:\\�½��ļ���\\�쳣����4.wmv");
//		System.out.println("�ļ����ļ��л����ļ�:"+file.isFile());
//		System.out.println("�ļ��Ƿ����:"+file.exists());
//		System.out.println("�ļ�����:"+file.getName());
//		System.out.println("����·��:"+file.getAbsolutePath());
//		System.out.println("���·��:"+file.getPath());
//		System.out.println("����·��:"+file.getParent());
//		System.out.println("����Ŀ¼:"+file.mkdir());
//		System.out.println("����Ŀ¼:"+file.mkdirs());
//		System.out.println("��ȡ����"+file.length());
//	    System.out.println("����Ŀ¼:"+file.createNewFile());
		
		
//		InputStream A=new FileInputStream(file);//������  ��һ���ļ�
//		byte[] b=new byte[(int) file.length()];
//		A.read(b);
//		System.out.println(new String(b));   //���ֽ���ת�����ַ���
//		
//		
//		Reader reader =new FileReader(file);  //�ַ���  reader  writer
//		char[] c=new char[(int)file.length()];//char �ַ�
//		reader.read(c);
//
//		System.out.println(new String(c));
//		OutputStream A=new FileOutputStream(file);
//		String abcd="nixiangwoma";
//		A.write(abcd.getBytes());
//		System.out.println("д�����");
	
//		Writer wri=new FileWriter(file,true);
//		wri.write("1234567");
//		wri.close();
//		System.out.println("д�����");
	
	
	
//		Reader r=new FileReader(file);
//		BufferedReader br=new BufferedReader(r);
//		String str=br.readLine();
//		while(str!=null) {
//			System.out.println(str);
//			str=br.readLine();
//		}
//		InputStream A=new FileInputStream(file);//������  ��һ���ļ�
//		byte[] b=new byte[(int) file.length()];
//		A.read(b);
//		System.out.println(new String(b));   //���ֽ���ת�����ַ���

		InputStream sp=new FileInputStream(file);
		byte[] a=new byte[(int) file.length()];
		System.out.println(sp.read(a));
	    System.out.println("����Ŀ¼:"+file2.createNewFile());
		
//	    OutputStream spnr=new FileOutputStream(file2);
//		String abcd="nixiangwoma";
//		spnr.write(abcd.getBytes());
	    
//        Reader reader=new FileReader(file);
//		BufferedReader spnr=new BufferedReader(reader);
//		String str=spnr.readLine();
		OutputStream fang=new FileOutputStream(file2,true);

//		while(str!=null) {
	
			fang.write(a);
			
//			str=spnr.readLine();
//		}
//		OutputStream A=new FileOutputStream(file2);
//		String abcd="spnew";
//		A.write(abcd.getBytes());
//		System.out.println("����Ŀ¼:"+file2.createNewFile());
	}
}

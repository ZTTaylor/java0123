package HouseWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UsersManage {
	
	public static void main(String[] args) {
		ArrayList<String> name=new ArrayList();
		ArrayList<String> sex=new ArrayList();
		ArrayList<Integer> number=new ArrayList();
		int n=1;
		do {
			System.out.println("***************��ӭѧ������ϵͳ***************");
			System.out.println("*********��ѡ����в���*********");
			System.out.println("*********1.������Ϣ*********");
			System.out.println("*********2.ɾ����Ϣ*********");
			System.out.println("*********3.�޸���Ϣ*********");
			System.out.println("*********4.��ѯ��Ϣ*********");
			Scanner Input=new Scanner(System.in);
			String str=Input.next();
			int i=Integer.parseInt(str);
		switch(i){
		case 1:do {
			   System.out.println("*********��������ѧ��*********");
		       Integer number1=Input.nextInt();
		       number.add(number1);
			   System.out.println("*********������������*********");
			   String name1=Input.next();
		       name.add(name1);
			   System.out.println("*********���������Ա�*********");
			   String sex1=Input.next();
		       sex.add(sex1);
			   System.out.println("*******����ɹ�*******");
			   System.out.println("***������0������һ���������9ѡ����������Ϣ***");
			   int opt=Input.nextInt();
		       n=opt;
			   }while(n!=0);
		break;
		case 2:do {
			   System.out.println("*********����Ҫɾ��ѧ��*********");
			   Integer number1=Input.nextInt();
			   int a=number.indexOf(number1);

			   number.remove(a);
			   name.remove(a);
			   sex.remove(a);
			  // System.out.println("*********��.ɾ������*********");
			  // System.out.println("*********��.ɾ���Ա�*********");
			   System.out.println("*******ɾ���ɹ�*******");
			   System.out.println("***������0������һ���������9ѡ�����ɾ����Ϣ***");
			   int opt=Input.nextInt();
		       n=opt;
		       }while(n!=0);
	    break;
		case 3:do {
			   System.out.println("*********Ҫ�޸���Ϣ��ѧ��*********");
		       Integer number1=Input.nextInt();
			   int a=number.indexOf(number1);
			   System.out.println("**********������**********");
			   name.set(a, Input.next());
			   System.out.println("**********���Ա�**********");
			   sex.set(a, Input.next());
			   System.out.println("**********ɾ���ɹ�**********");
			   System.out.println("***������0������һ���������9ѡ������޸���Ϣ***");
			   int opt=Input.nextInt();
		       n=opt;
		}while(n!=0);
		   break;
		case 4:do {
			     System.out.println("*****������Ҫ��ѯ��ѧ��****");
				 int input=Input.nextInt();
				 if(number.contains(input)) {
					 System.out.println("********����ѯ����Ϣ����********");
					 int index=number.indexOf(input);
					 System.out.println("*********������"+name.get(index)+"*********");
					 System.out.println("*********�Ա���"+sex.get(index)+"*********");
				 }else {
					 System.out.println("����ѯ����Ϣ������");
				 }
				   System.out.println("***������0������һ���������9ѡ�������ѯ��Ϣ***");
				   int opt=Input.nextInt();
			       n=opt;
		}while(n!=0);
	       break;
		}
		}while(n==0);

		}	
	
	}

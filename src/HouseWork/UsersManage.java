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
			System.out.println("***************欢迎学生管理系统***************");
			System.out.println("*********请选择进行操作*********");
			System.out.println("*********1.增加信息*********");
			System.out.println("*********2.删除信息*********");
			System.out.println("*********3.修改信息*********");
			System.out.println("*********4.查询信息*********");
			Scanner Input=new Scanner(System.in);
			String str=Input.next();
			int i=Integer.parseInt(str);
		switch(i){
		case 1:do {
			   System.out.println("*********①请输入学号*********");
		       Integer number1=Input.nextInt();
		       number.add(number1);
			   System.out.println("*********②请输入姓名*********");
			   String name1=Input.next();
		       name.add(name1);
			   System.out.println("*********③请输入性别*********");
			   String sex1=Input.next();
		       sex.add(sex1);
			   System.out.println("*******输入成功*******");
			   System.out.println("***请输入0返回上一层或者输入9选择继续添加信息***");
			   int opt=Input.nextInt();
		       n=opt;
			   }while(n!=0);
		break;
		case 2:do {
			   System.out.println("*********输入要删除学号*********");
			   Integer number1=Input.nextInt();
			   int a=number.indexOf(number1);

			   number.remove(a);
			   name.remove(a);
			   sex.remove(a);
			  // System.out.println("*********②.删除姓名*********");
			  // System.out.println("*********③.删除性别*********");
			   System.out.println("*******删除成功*******");
			   System.out.println("***请输入0返回上一层或者输入9选择继续删除信息***");
			   int opt=Input.nextInt();
		       n=opt;
		       }while(n!=0);
	    break;
		case 3:do {
			   System.out.println("*********要修改信息的学号*********");
		       Integer number1=Input.nextInt();
			   int a=number.indexOf(number1);
			   System.out.println("**********新姓名**********");
			   name.set(a, Input.next());
			   System.out.println("**********新性别**********");
			   sex.set(a, Input.next());
			   System.out.println("**********删除成功**********");
			   System.out.println("***请输入0返回上一层或者输入9选择继续修改信息***");
			   int opt=Input.nextInt();
		       n=opt;
		}while(n!=0);
		   break;
		case 4:do {
			     System.out.println("*****请输入要查询的学号****");
				 int input=Input.nextInt();
				 if(number.contains(input)) {
					 System.out.println("********所查询的信息存在********");
					 int index=number.indexOf(input);
					 System.out.println("*********姓名是"+name.get(index)+"*********");
					 System.out.println("*********性别是"+sex.get(index)+"*********");
				 }else {
					 System.out.println("所查询的信息不存在");
				 }
				   System.out.println("***请输入0返回上一层或者输入9选择继续查询信息***");
				   int opt=Input.nextInt();
			       n=opt;
		}while(n!=0);
	       break;
		}
		}while(n==0);

		}	
	
	}

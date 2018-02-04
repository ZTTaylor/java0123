package HouseWork;

import java.util.ArrayList;
import java.util.Scanner;

public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name=new ArrayList();
		ArrayList<Integer> money=new ArrayList();
		ArrayList<Integer> cardID=new ArrayList();
		int n=1;
		do {
			System.out.println("***************欢迎进入银行系统***************");
			System.out.println("*********请选择进行操作*********");
			System.out.println("*********1.申请开户*********");
			System.out.println("**********2.存钱**********");
			System.out.println("**********3.取钱**********");
			System.out.println("**********4.转账**********");
			Scanner Input=new Scanner(System.in);
			String str=Input.next();
			int i=Integer.parseInt(str);
		switch(i){
		case 1:do {
			   System.out.println("*********①请输入姓名*********");
			   String name1=Input.next();
		       name.add(name1);
		       //生成卡号
			   double id=Math.random()*10000000;
			   int iid=(int)id;
			   cardID.add(iid);
			   System.out.println("****开户成功请牢记您的卡号"+iid+"*********");
			   System.out.println("*********①请输入存钱金额*********");
			   int money1=Input.nextInt();
			   money.add(money1);
			   System.out.println("*******输入成功*******");
			   System.out.println("***请输入0返回上一层或者输入9选择继续添加信息***");
			   int opt=Input.nextInt();
		       n=opt;
			   }while(n!=0);
		break;
		case 2:do {
			   System.out.println("*********输入要存钱的姓名*********");
			   String name1=Input.next();
			   int a=name.indexOf(name1);
			   System.out.println("*********输入要存钱的金额*********");
			   Integer money1=Input.nextInt();
			   int x=money.get(a);
			   cardID.set(a,x+money1 );
			   int sum=x+money1;
			   System.out.println("*******存钱成功现在还有"+sum+"*******");
			   System.out.println("*******存钱成功*******");
			   
			   System.out.println("***请输入0返回上一层或者输入9选择继续存钱***");
			   int opt=Input.nextInt();
		       n=opt;
		       }while(n!=0);
	    break;
		case 3:do {
			   System.out.println("*********输入要取钱的姓名*********");
			   String name1=Input.next();
			   int a=name.indexOf(name1);
			   System.out.println("*********输入要取钱的金额*********");
			   Integer money1=Input.nextInt();
			   int x=money.get(a);
			   cardID.set(a,x-money1 );
			   int sum=x-money1;
			   System.out.println("*******存钱成功现在还有"+sum+"*******");
			   System.out.println("***请输入0返回上一层或者输入9选择继续修改信息***");
			   int opt=Input.nextInt();
		       n=opt;
		}while(n!=0);
		   break;
		case 4:do {
			     System.out.println("*****请输入要查询的账户****");
				 int input=Input.nextInt();
				 if(cardID.contains(input)) {
					 System.out.println("********所查询的信息存在********");
					 int index=cardID.indexOf(input);
					 System.out.println("*********姓名是"+name.get(index)+"*********");
					 System.out.println("*********账户剩余金额"+money.get(index)+"*********");
				 }else {
					 System.out.println("所查询的账户不存在");
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

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
			System.out.println("***************��ӭ��������ϵͳ***************");
			System.out.println("*********��ѡ����в���*********");
			System.out.println("*********1.���뿪��*********");
			System.out.println("**********2.��Ǯ**********");
			System.out.println("**********3.ȡǮ**********");
			System.out.println("**********4.ת��**********");
			Scanner Input=new Scanner(System.in);
			String str=Input.next();
			int i=Integer.parseInt(str);
		switch(i){
		case 1:do {
			   System.out.println("*********������������*********");
			   String name1=Input.next();
		       name.add(name1);
		       //���ɿ���
			   double id=Math.random()*10000000;
			   int iid=(int)id;
			   cardID.add(iid);
			   System.out.println("****�����ɹ����μ����Ŀ���"+iid+"*********");
			   System.out.println("*********���������Ǯ���*********");
			   int money1=Input.nextInt();
			   money.add(money1);
			   System.out.println("*******����ɹ�*******");
			   System.out.println("***������0������һ���������9ѡ����������Ϣ***");
			   int opt=Input.nextInt();
		       n=opt;
			   }while(n!=0);
		break;
		case 2:do {
			   System.out.println("*********����Ҫ��Ǯ������*********");
			   String name1=Input.next();
			   int a=name.indexOf(name1);
			   System.out.println("*********����Ҫ��Ǯ�Ľ��*********");
			   Integer money1=Input.nextInt();
			   int x=money.get(a);
			   cardID.set(a,x+money1 );
			   int sum=x+money1;
			   System.out.println("*******��Ǯ�ɹ����ڻ���"+sum+"*******");
			   System.out.println("*******��Ǯ�ɹ�*******");
			   
			   System.out.println("***������0������һ���������9ѡ�������Ǯ***");
			   int opt=Input.nextInt();
		       n=opt;
		       }while(n!=0);
	    break;
		case 3:do {
			   System.out.println("*********����ҪȡǮ������*********");
			   String name1=Input.next();
			   int a=name.indexOf(name1);
			   System.out.println("*********����ҪȡǮ�Ľ��*********");
			   Integer money1=Input.nextInt();
			   int x=money.get(a);
			   cardID.set(a,x-money1 );
			   int sum=x-money1;
			   System.out.println("*******��Ǯ�ɹ����ڻ���"+sum+"*******");
			   System.out.println("***������0������һ���������9ѡ������޸���Ϣ***");
			   int opt=Input.nextInt();
		       n=opt;
		}while(n!=0);
		   break;
		case 4:do {
			     System.out.println("*****������Ҫ��ѯ���˻�****");
				 int input=Input.nextInt();
				 if(cardID.contains(input)) {
					 System.out.println("********����ѯ����Ϣ����********");
					 int index=cardID.indexOf(input);
					 System.out.println("*********������"+name.get(index)+"*********");
					 System.out.println("*********�˻�ʣ����"+money.get(index)+"*********");
				 }else {
					 System.out.println("����ѯ���˻�������");
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

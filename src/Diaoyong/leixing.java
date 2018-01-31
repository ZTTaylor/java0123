package Diaoyong;

public class leixing {
	public static void main(String[] args) {
//	Cat cat1=new Cat();
//		cat1.setName("erpang");
//		cat1.setAge(3);
//		
//	Cat cat2=new Cat();
//	System.out.println(cat1.name);
//	System.out.println(cat2.name);
//	cat1.menthod();
		Cat jumao=new Cat("橘色的猫",2);
		Cat baimao=new Cat("白色的猫",1);
		System.out.println(jumao.getAge());
		System.out.println(jumao.getName());
		System.out.println(baimao.getAge());
		Cat shu=new Cat();
		Cat shu1=new Cat();
		float bb=shu.mul(2.5f,5);
		float cc=shu.mul(5,2.5f);
		float dd=shu.mul(1,1.1f,1.1f);
		System.out.println(bb);
		System.out.println(cc);
		System.out.println(dd);
		
		
		

		char a='a';
		char b=(char)((int)a+1);
		System.out.println(b);  //输出b
}
}
package java0123;

public class nishu {
	public static void main(String[] args){
		int a=4131;
		int qian=a/1000;
		int bai=a%1000/100;
		int shi=a%1000%100/10;
		int ge=a%1000%100%10;
		int nishu=ge*1000+shi*100+bai*10+qian;
		System.out.println(nishu);
	}
}

package java0123;

public class year {
	public static void main(String[] args) {
		int year=2018;
		if((year%100!=0&&year%4==0)||year%400==0) {
			System.out.println("ÈòÄê");
		}else {
			System.out.println("Æ½Äê");
		}
		
	}
}

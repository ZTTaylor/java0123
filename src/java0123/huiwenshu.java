package java0123;

public class huiwenshu {
	public static void main(String[] args) {
		for(int i=10000;i<=99999;i++) {
			int wan=i/10000;
			int qian=i%10000/1000;
			int bai=i%10000%1000/100;
			int shi=i%10000%1000%100/10;
			int ge=i%10000%1000%100%10;
			if((ge==wan)&(qian==shi)) {
				System.out.println(+i+"是回文数");
			}
		}
	}
}

package java0123;

public class flower {
	public static void main(String[] args) {
		for(int i=100;i<1000;i++) {
			int bai=i/100;
			int shi=i%100/10;
			int ge=i%100%10;
			int sum=bai*bai*bai+shi*shi*shi+ge*ge*ge;
			if(sum==i) {
				System.out.println(i);
			}
		}
	}
}

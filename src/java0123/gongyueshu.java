package java0123;

public class gongyueshu {
	public static void main(String[] args) {
	int a=12;
	int b=30;
	int min;
	int max;
	int i;
	if(a<b){
		min=a;
		max=b;
	}else {
		min=b;
		max=a;
	}
	for(i=min;i>0;i--) {
		if((a%i==0)&&(b%i==0)) {
			System.out.println("最大公约数是"+i);
			break;
		}
	}
	for(i=max;max<=i;i++) {
		if((i%a==0)&&(i%b==0)) {
			System.out.println("最大公倍数是"+i);
			break;
		}
	}
}
}

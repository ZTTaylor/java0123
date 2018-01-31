package java0123;

public class maopao {
	public static void main(String[] args) {
		int [] a={9,1,3,6,8,2,7,4,5};
		for(int j=0;j<a.length-1;j++) {
			for(int i=0;i<a.length-1-j;i++) {
				if(a[i]>a[i+1]) {
					int temp;
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
			for(int b:a) {
				System.out.print(b+",");
			}
			System.out.println();
		}
		
	}
}

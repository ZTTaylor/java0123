package java0123;

public class xuanze {
	public static void main(String[] args) {
		int a []= {5,1,3,6,8,2,7,4,9};
//		for(int j=0;j<a.length-1;j++) {
//			for(int i=0;i<a.length-1-j;i++){    //i=j╬м©ирт
//				if(a[j]<a[j+1+i]) {
//					int temp=a[j];
//				    a[j]=a[j+1+i];
//				    a[j+1+i]=temp;
//				}
//			}
//			for(int b:a) {
//				System.out.print(b+",");
//			}
//			System.out.println();
//		}
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		for(int b:a) {
			System.out.print(b+",");
		}
		System.out.println();
		}
	}
}

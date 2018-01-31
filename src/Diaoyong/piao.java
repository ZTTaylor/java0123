package Diaoyong;

public class piao implements Runnable {

	int count=20;
	Object lock=new Object();
	public void run() {
		
		while(count>0) {
		
			synchronized(lock) {
			System.out.println(Thread.currentThread().getName()+"Âò³ı³öÁË"+(count--)+"ÕÅÆ±");
		    try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
	}

}

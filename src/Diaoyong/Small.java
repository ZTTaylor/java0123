package Diaoyong;

public class Small extends Car implements Oiltype ,Beiyong{
    public Small(String name,String type,int money,int size){
    	super(name,type,money,size);
    }
    public Small(){
    	super();
    }
	public void volume() {
		System.out.println("�ҵ�����Ƚ�С");
	}
	public void oil(){
		System.out.println("��ȼ�յ�������1");
	}
	@Override
	public void BYwheel() {
		System.out.println("��û�б��ó�̥");
		
	}
	
}

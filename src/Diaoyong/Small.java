package Diaoyong;

public class Small extends Car implements Oiltype ,Beiyong{
    public Small(String name,String type,int money,int size){
    	super(name,type,money,size);
    }
    public Small(){
    	super();
    }
	public void volume() {
		System.out.println("我的体积比较小");
	}
	public void oil(){
		System.out.println("我燃烧的是汽油1");
	}
	@Override
	public void BYwheel() {
		System.out.println("我没有备用车胎");
		
	}
	
}

package Diaoyong;

public class Car  {
	public Car(String name,String type,int money,int size) {
		this.name=name;
		this.type=type;
		this.money=money;
		this.size=size;
	}
	public Car() {
		
	}
	private String name;
	private String type;
	private int money;
	private int size;
	public  int a;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void volume() {
		System.out.println("我是一辆汽车");
	}
}

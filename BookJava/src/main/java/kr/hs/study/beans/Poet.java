package kr.hs.study.beans;

public class Poet implements Book {
	String name;
	String title;
	int price;
	
	public Poet(String name, String title, int price) {
		super();
		this.name = name;
		this.title = title;
		this.price = price;
	}
	
	public void buy() {
		System.out.println(name+"의 시 '" + title + "'을 " + price+"원에 산다.");
	}
	public void sell() {
		System.out.println(name+"의 시 '" + title + "'을 " + price+"원에 판다.");
	}
	public void create() {
		System.out.println(name+"이 시 '" + title+"'을 짓다.");
	}
}

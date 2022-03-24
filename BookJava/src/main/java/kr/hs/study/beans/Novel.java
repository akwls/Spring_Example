package kr.hs.study.beans;

public class Novel implements Book {
	String name;
	String title;
	int price;
	
	public Novel(String name, String title, int price) {
		super();
		this.name = name;
		this.title = title;
		this.price = price;
	}
	
	public void buy() {
		System.out.println(name+"의 소설 '" + title + "'을 " + price+"원에 산다.");
	}
	public void sell() {
		System.out.println(name+"의 소설 '" + title + "'을 " + price+"원에 판다.");
	}
	public void create() {
		System.out.println(name+"이 소설 '" + title+"'을 쓰다.");
	}
}

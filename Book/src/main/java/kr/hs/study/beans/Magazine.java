package kr.hs.study.beans;

public class Magazine implements Book {
	String name;
	String title;
	int price;
	
	public Magazine(String name, String title, int price) {
		super();
		this.name = name;
		this.title = title;
		this.price = price;
	}
	
	public void buy() {
		System.out.println(name+"의 잡지 '" + title + "'을 " + price+"에 산다.");
	}
	public void sell() {
		System.out.println(name+"의 잡지 '" + title + "'을 " + price+"에 판다.");
	}
	public void create() {
		System.out.println(name+"이 잡지 '" + title+"'을 만들다.");
	}

}

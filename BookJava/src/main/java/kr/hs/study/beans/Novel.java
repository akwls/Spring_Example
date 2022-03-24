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
		System.out.println(name+"�� �Ҽ� '" + title + "'�� " + price+"���� ���.");
	}
	public void sell() {
		System.out.println(name+"�� �Ҽ� '" + title + "'�� " + price+"���� �Ǵ�.");
	}
	public void create() {
		System.out.println(name+"�� �Ҽ� '" + title+"'�� ����.");
	}
}

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
		System.out.println(name+"�� ���� '" + title + "'�� " + price+"�� ���.");
	}
	public void sell() {
		System.out.println(name+"�� ���� '" + title + "'�� " + price+"�� �Ǵ�.");
	}
	public void create() {
		System.out.println(name+"�� ���� '" + title+"'�� �����.");
	}

}

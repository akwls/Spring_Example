package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Novel implements Book {
	String name;
	String title;
	int price;
	
	public Novel(@Value("kim")String name, @Value("spring")String title, @Value("8000")int price) {
		super();
		this.name = name;
		this.title = title;
		this.price = price;
	}

	public void sell() {
		System.out.println(name+"�� �Ҽ� '" + title + "'�� " + price + "���� �Ǵ�.");
	}
	
	public void buy() {
		System.out.println(name+"�� �Ҽ� '" + title + "'�� " + price + "���� ���.");
	}
	public void create() {
		System.out.println(name+"�� �Ҽ� '" + title + "'�� ����.");
	}
}

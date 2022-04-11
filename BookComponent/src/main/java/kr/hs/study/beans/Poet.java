package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Poet implements Book {
	String name;
	String title;
	int price;
	
	public Poet(@Value("lee")String name, @Value("spring2")String title, @Value("10000")int price) {
		super();
		this.name = name;
		this.title = title;
		this.price = price;
	}

	public void sell() {
		System.out.println(name+"�� �� '" + title + "'�� " + price + "���� �Ǵ�.");
	}
	
	public void buy() {
		System.out.println(name+"�� �� '" + title + "'�� " + price + "���� ���.");
	}
	public void create() {
		System.out.println(name+"�� �� '" + title + "'�� ����.");
	}

}

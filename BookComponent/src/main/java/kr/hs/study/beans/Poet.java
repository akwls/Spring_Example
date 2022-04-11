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
		System.out.println(name+"의 시 '" + title + "'을 " + price + "원에 판다.");
	}
	
	public void buy() {
		System.out.println(name+"의 시 '" + title + "'을 " + price + "원에 산다.");
	}
	public void create() {
		System.out.println(name+"이 시 '" + title + "'을 쓰다.");
	}

}

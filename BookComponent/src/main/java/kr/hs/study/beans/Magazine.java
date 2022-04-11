package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Magazine implements Book {
	String name;
	String title;
	int price;
	
	public Magazine(@Value("park")String name, @Value("spring3")String title, @Value("20000")int price) {
		super();
		this.name = name;
		this.title = title;
		this.price = price;
	}
	
	public void sell() {
		System.out.println(name+"의 잡지 '" + title + "'을 " + price + "원에 판다.");
	}
	
	public void buy() {
		System.out.println(name+"의 잡지 '" + title + "'을 " + price + "원에 산다.");
	}
	public void create() {
		System.out.println(name+"이 잡지 '" + title + "'을 만들다.");
	}
}

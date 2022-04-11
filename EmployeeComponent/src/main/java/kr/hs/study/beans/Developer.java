package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Developer implements Employee {
	private int checkin;
	private int checkout;
	
	public Developer(@Value("10")int checkin, @Value("7")int checkout) {
		super();
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public void Checkin() {
		System.out.println("������ " + checkin + "�� ���");
	}
	
	public void Checkout() {
		System.out.println("������ " + checkout + "�� ���");
	}
}

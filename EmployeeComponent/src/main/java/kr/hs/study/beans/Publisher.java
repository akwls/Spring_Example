package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Publisher implements Employee {
	private int checkin;
	private int checkout;
	
	public Publisher(@Value("11")int checkin, @Value("6")int checkout) {
		super();
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public void Checkin() {
		System.out.println("�ۺ��� " + checkin + "�� ���");
	}
	
	public void Checkout() {
		System.out.println("�ۺ��� " + checkout + "�� ���");
	}
 
}

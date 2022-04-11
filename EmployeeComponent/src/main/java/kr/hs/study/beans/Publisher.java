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
		System.out.println("ÆÛºí¸®¼Å " + checkin + "½Ã Ãâ±Ù");
	}
	
	public void Checkout() {
		System.out.println("ÆÛºí¸®¼Å " + checkout + "½Ã Åð±Ù");
	}
 
}

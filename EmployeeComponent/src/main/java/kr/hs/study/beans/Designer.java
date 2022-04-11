package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Designer implements Employee {
	private int checkin;
	private int checkout;
	

	public Designer(@Value("7")int checkin, @Value("10")int checkout) {
		super();
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public void Checkin() {
		System.out.println("디자이너 " + checkin + "시 출근");
	}
	
	public void Checkout() {
		System.out.println("디자이너 " + checkout + "시 퇴근");
	}
}

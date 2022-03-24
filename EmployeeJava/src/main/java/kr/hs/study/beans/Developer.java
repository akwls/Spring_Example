package kr.hs.study.beans;

public class Developer implements Employee {
	private int checkin;
	private int checkout;
	
	public Developer(int checkin, int checkout) {
		super();
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	public void Checkin() {
		System.out.println("개발자 " + checkin + "시 출근");
	}
	public void Checkout() {
		System.out.println("개발자 " + checkout + "시 퇴근");
	}
}

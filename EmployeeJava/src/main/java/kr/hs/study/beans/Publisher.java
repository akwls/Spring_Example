package kr.hs.study.beans;

public class Publisher implements Employee {
	private int checkin;
	private int checkout;
	
	public Publisher(int checkin, int checkout) {
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

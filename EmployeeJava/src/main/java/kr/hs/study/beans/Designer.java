package kr.hs.study.beans;

public class Designer implements Employee {
	private int checkin;
	private int checkout;
	
	public Designer(int checkin, int checkout) {
		super();
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	public void Checkin() {
		System.out.println("�����̳� " + checkin + "�� ���");
	}
	public void Checkout() {
		System.out.println("�����̳� " + checkout + "�� ���");
	}
}

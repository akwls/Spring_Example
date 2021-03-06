package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Test {
	@Autowired
	private Person p1;
	@Autowired
	private Person p2;
	@Autowired
	private Person p3;
	
	public Test(Person p1, Person p2, Person p3) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public Person getP1() {
		return p1;
	}

	public Person getP2() {
		return p2;
	}

	public Person getP3() {
		return p3;
	}
	
	
}

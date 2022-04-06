package kr.hs.study.beans;

public class Person {
	private String name;
	private int age;
	private String message;
	
	public void eat() {
		System.out.println(message);
	}

	public Person(String name, int age, String message) {
		super();
		this.name = name;
		this.age = age;
		this.message = message;
	}

	public void print() {
		System.out.print(name + " " + age + " ");
		eat();
	}
	
}

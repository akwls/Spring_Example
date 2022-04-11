package kr.hs.study.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Person {
	private String name;
	private int age;
	private String message;
	
	public void eat() {
		System.out.println(message);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public void print() {
		System.out.print(name + " " + age + " ");
		eat();
	}
}

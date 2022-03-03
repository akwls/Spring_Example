package kr.hs.study.main;

import kr.hs.study.beans.*;

public class MainClass {

	public static void main(String[] args) {
		
		// HelloWorld hello1 = new HelloWorldEn();
		HelloWorld hello1 = new HelloWorldKr(); 
		// 부모의 참조 변수로 자식 객체를 가리킴.
		// 인터페이스를 사용하면 다형성을 가지면서
		// 객체를 바꾸고자 할 때, 변경해야 하는 코드가 줄어들게 된다.
		
		callMethod(hello1); // static 때문에 객체 없어도 호출할 수 있음.
	}
	
	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}

}

package kr.hs.study.main;

import kr.hs.study.beans.*;

public class MainClass {

	public static void main(String[] args) {
		
		// HelloWorld hello1 = new HelloWorldEn();
		HelloWorld hello1 = new HelloWorldKr(); 
		// �θ��� ���� ������ �ڽ� ��ü�� ����Ŵ.
		// �������̽��� ����ϸ� �������� �����鼭
		// ��ü�� �ٲٰ��� �� ��, �����ؾ� �ϴ� �ڵ尡 �پ��� �ȴ�.
		
		callMethod(hello1); // static ������ ��ü ��� ȣ���� �� ����.
	}
	
	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}

}

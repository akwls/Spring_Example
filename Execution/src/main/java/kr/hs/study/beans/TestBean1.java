package kr.hs.study.beans;

public class TestBean1 {
	public void method1() {
		System.out.println("kr.hs.study.beans.TestBean1의 method1");
	}
	public void method1(int a1) {
		System.out.println("int 매개변수 method1");
	}
	public void method1(int a1, int a2) {
		System.out.println("int int 매개변수 method1");
	}
	public void method1(int a1, String s1) {
		System.out.println("int String 매개변수 method1");
	}
	public void method1(String s1) {
		System.out.println("String 매개변수 method1");
	}
	public int method1(int a, int b, int c) {
		System.out.println("String 매개변수 method1");
		return c;
	}
	public void method2() {
		System.out.println("kr.hs.study.beans.TestBean1의 method2");
	}
}

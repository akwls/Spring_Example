package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;

public class MainClass {
	public static void main(String args[]) {
		// config.xml�� �ε���Ų��.
		// ��ü�� �����ؼ� �����̳ʿ� �����Ѵ�.
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		// getBean() : container�� �ִ� ��ü�� �����´�.
		// ��ȯ���� Object
		TestBean t1 = (TestBean)ctx.getBean("t1");
		
		// t1�� �ִ� �ּҰ��� ��µ�
		System.out.println("t1: " + t1);
		
		// ������ ��ü�� �ٸ� ���� ����
		// TestBean t2 = (TestBean)ctx.getBean("t1");
		TestBean t2 = ctx.getBean("t1", TestBean.class); // casting ���� ����ϴ� ���.
		
		// t1�� �ּҰ��� ������.
		System.out.println("t2: " + t2);
		
		
		// container�� �ִ� ��ü �Ҹ�
		ctx.close();
		
	}
}

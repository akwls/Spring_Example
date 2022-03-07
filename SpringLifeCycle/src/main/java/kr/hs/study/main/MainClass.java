package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		// config.xml에 정의된 객체를 생성함.
		// 생성자 호출됨.
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 t1 = ctx.getBean("t1", TestBean1.class);
		System.out.println("t1 : " + t1);
		
		TestBean2 t2 = ctx.getBean("t2", TestBean2.class); // lazy-init 때문에 getBean() 메소드가 실행되는 시점에 생성됨.
		System.out.println("t2 : " + t2);
		
		TestBean2 t3 = ctx.getBean("t2", TestBean2.class); 
		// scope="prototype" 때문에 getBean() 메소드가 호출될 때마다 새로운 객체가 생성됨 -> singleton 사용하지 않음.
		System.out.println("t3 : " + t3);
		
		ctx.close();
				
	}

}

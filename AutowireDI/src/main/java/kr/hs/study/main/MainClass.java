package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean3;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
		
		System.out.println("data1 : " + obj1.getData1());
		System.out.println("data2 : " + obj1.getData2());
		
		System.out.println("=====================================");
	
		/*
		TestBean1 obj2 = ctx.getBean("t2", TestBean1.class);
		
		System.out.println("data1 : " + obj2.getData1());
		System.out.println("data2 : " + obj2.getData2());
		*/
		
		TestBean1 obj3 = ctx.getBean("t3", TestBean1.class);
		
		System.out.println("data1 : " + obj3.getData1());
		System.out.println("data2 : " + obj3.getData2());
		
		System.out.println("=====================================");
		
		TestBean3 obj4 = ctx.getBean("t4", TestBean3.class);
		System.out.println("data1 : " + obj4.getData1());
		System.out.println("data2 : " + obj4.getData2());
		ctx.close();

	}

}

package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean obj1 = ctx.getBean("t1", TestBean.class);
		System.out.println("obj1 : " + obj1);
		obj1.print();
		
		System.out.println("========================");
		
		TestBean obj2 = ctx.getBean("t2", TestBean.class);
		System.out.println("obj2 : " + obj2);
		obj2.print();
		
		System.out.println("========================");
		
		TestBean obj3 = ctx.getBean("t3", TestBean.class);
		System.out.println("obj3 : " + obj3);
		obj3.print();
		
		System.out.println("========================");
		
		TestBean obj4 = ctx.getBean("t4", TestBean.class);
		System.out.println("obj4 : " + obj4);
		obj4.print();
		
		System.out.println("========================");
		
		TestBean obj5 = ctx.getBean("t5", TestBean.class);
		System.out.println("obj5 : " + obj5);
		obj5.print();
		
		System.out.println("========================");
		
		
		
		
		
		TestBean2 obj6 = ctx.getBean("t6", TestBean2.class);
		System.out.println("obj6 : " + obj6);
		obj6.print();
		
		System.out.println("========================");
		
		TestBean2 obj7 = ctx.getBean("t7", TestBean2.class);
		System.out.println("obj7 : " + obj7);
		obj7.print();
		
		
		ctx.close();

	}

}

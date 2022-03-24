package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------- xml ----------------");
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
			
		//TestBean1 obj1 = ctx.getBean("xml1", TestBean1.class);
		//System.out.println(obj1.getData1());
		
		//System.out.println("==============================");
		
		TestBean2 obj2 = ctx.getBean("xml2", TestBean2.class);
		System.out.println("data1 : " + obj2.getData1());
		System.out.println("data2 : " + obj2.getData2());
		
		ctx.close();
		
		System.out.println("--------------- java ----------------");
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean2 obj3 = ctx2.getBean("java2", TestBean2.class);
		System.out.println("data1 : " + obj3.getData1());
		System.out.println("data2 : " + obj3.getData2());
		
		ctx2.close();
	}

}

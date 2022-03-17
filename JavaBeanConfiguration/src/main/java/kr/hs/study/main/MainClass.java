package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.BeanClassConfiguration;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// BeanClassConfiguration.class 파일을 로딩해서 bean 등록
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanClassConfiguration.class);
		
		TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
		System.out.println("obj1 : " + obj1);
		
		TestBean1 obj2 = ctx.getBean("t2", TestBean1.class);
		System.out.println("obj2 : " + obj2);
		
		ctx.close();

	}

}

package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Book;
import kr.hs.study.beans.Magazine;
import kr.hs.study.beans.Novel;
import kr.hs.study.beans.Poet;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		Book b1 = ctx.getBean("b1", Novel.class);
		
		b1.buy();
		b1.sell();
		b1.create();
		
		System.out.println("========================");
		
		Book b2 = ctx.getBean("b2", Poet.class);
		
		b2.buy();
		b2.sell();
		b2.create();
		
		System.out.println("========================");
		
		Book b3 = ctx.getBean("b3", Magazine.class);
		
		b3.buy();
		b3.sell();
		b3.create();
				
		ctx.close();
	}
}

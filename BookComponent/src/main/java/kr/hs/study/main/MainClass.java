package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.Book;
import kr.hs.study.beans.Magazine;
import kr.hs.study.beans.Novel;
import kr.hs.study.beans.Poet;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		Book b1 = ctx.getBean(Novel.class);
		b1.buy();
		b1.sell();
		b1.create();
		
		System.out.println("=================");
		
		Book b2 = ctx.getBean(Poet.class);
		b2.buy();
		b2.sell();
		b2.create();
		
		System.out.println("=================");
		
		Book b3 = ctx.getBean(Magazine.class);
		b3.buy();
		b3.sell();
		b3.create();
		
		ctx.close();

	}

}

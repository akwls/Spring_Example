package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.Designer;
import kr.hs.study.beans.Developer;
import kr.hs.study.beans.Employee;
import kr.hs.study.beans.Publisher;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		Employee emp1 = ctx.getBean(Designer.class);
		emp1.Checkin();
		emp1.Checkout();
		
		System.out.println("==================");
		
		Employee emp2 = ctx.getBean(Developer.class);
		emp2.Checkin();
		emp2.Checkout();
		
		System.out.println("==================");
		
		Employee emp3 = ctx.getBean(Publisher.class);
		emp3.Checkin();
		emp3.Checkout();
		
		ctx.close();

	}

}

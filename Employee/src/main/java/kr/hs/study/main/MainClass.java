package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Designer;
import kr.hs.study.beans.Developer;
import kr.hs.study.beans.Employee;
import kr.hs.study.beans.Publisher;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		Employee emp1 = ctx.getBean("emp1", Designer.class);
		emp1.Checkin();
		emp1.Checkout();
		
		System.out.println("===================================");
		
		Employee emp2 = ctx.getBean("emp2", Developer.class);
		emp2.Checkin();
		emp2.Checkout();
		
		System.out.println("===================================");
		
		Employee emp3 = ctx.getBean("emp3", Publisher.class);
		emp3.Checkin();
		emp3.Checkout();
		
		ctx.close();
	}

}

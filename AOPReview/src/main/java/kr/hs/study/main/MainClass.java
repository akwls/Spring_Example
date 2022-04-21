package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.IPrintMsg;
import kr.hs.study.beans.PrintMsg;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		IPrintMsg msg1 = ctx.getBean("p1", PrintMsg.class);
		msg1.sayHello1();
		msg1.sayHello2();
		
		ctx.close();
	}

}

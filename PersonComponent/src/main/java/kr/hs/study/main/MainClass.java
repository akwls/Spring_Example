package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.Test;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		Test t1 = ctx.getBean(Test.class);
		t1.getP1().setName("kim");
		t1.getP1().setAge(30);
		t1.getP1().setMessage("¹ä¸Ô´Ù");
		t1.getP1().print();
		
		t1.getP2().setName("lee");
		t1.getP2().setAge(20);
		t1.getP2().setMessage("°úÀÚ¸Ô´Ù");
		t1.getP2().print();
		
		t1.getP3().setName("park");
		t1.getP3().setAge(40);
		t1.getP3().setMessage("¹°¸Ô´Ù");
		t1.getP3().print();
		
		ctx.close();
	}

}

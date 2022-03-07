package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;

public class MainClass {
	public static void main(String args[]) {
		// config.xml을 로딩시킨다.
		// 객체를 생성해서 컨테이너에 보관한다.
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		// getBean() : container에 있는 객체를 가져온다.
		// 반환값은 Object
		TestBean t1 = (TestBean)ctx.getBean("t1");
		
		// t1이 있는 주소값이 출력됨
		System.out.println("t1: " + t1);
		
		// 동일한 객체로 다른 변수 생성
		// TestBean t2 = (TestBean)ctx.getBean("t1");
		TestBean t2 = ctx.getBean("t1", TestBean.class); // casting 없이 사용하는 방법.
		
		// t1과 주소값이 동일함.
		System.out.println("t2: " + t2);
		
		
		// container에 있는 객체 소멸
		ctx.close();
		
	}
}

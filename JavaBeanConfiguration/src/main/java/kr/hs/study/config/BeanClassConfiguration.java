package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.TestBean1;

@Configuration // 이 파일은 spring 객체 생성파일임을 명시.
// config.xml의 역할과 동일(bean 생성)
public class BeanClassConfiguration {
	
	// 메서드 이름 = id
	@Bean // 아래 메서드를 실행하여 객체를 생성하라.
	public TestBean1 t1() {
		TestBean1 t1 = new TestBean1(); // t1 객체 생성
		return t1;
	}
	
	@Bean
	public TestBean1 t2() {
		return new TestBean1();
	}
}

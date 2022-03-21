package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.TestBean1;

// 이 파일은 bean을 만들라고 명령하는 파일.
@Configuration
public class BeanConfigClass {
	
	// 아래 메서드를 실행한 리턴값으로 bean을 만들어라.
	@Bean
	public TestBean1 t1() {
		return new TestBean1();
	}
	
	@Bean(name="new")
	public TestBean1 t2() {
		return new TestBean1();
	}
	
	@Bean
	@Lazy
	@Scope("prototype")
	public TestBean1 t3() {
		return new TestBean1();
	}
}

package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean2;
import kr.hs.study.beans.TestBean2;

@Configuration
public class BeanConfigClass {
	
	@Bean
	public DataBean2 d1() {
		return new DataBean2();
	}
	
	@Bean
	public DataBean2 d2() {
		return new DataBean2();
	}
	
	@Bean
	public TestBean2 java2() {
		return new TestBean2();
	}
}

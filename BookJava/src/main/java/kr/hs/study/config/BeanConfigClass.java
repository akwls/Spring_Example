package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.Magazine;
import kr.hs.study.beans.Novel;
import kr.hs.study.beans.Poet;

@Configuration
public class BeanConfigClass {
	
	@Bean
	public Novel b1() {
		return new Novel("kim", "spring", 8000);
	}
	
	@Bean
	public Poet b2() {
		return new Poet("lee", "spring2", 10000);
	}
	
	@Bean
	public Magazine b3() {
		return new Magazine("park", "spring3", 20000);
	}
}

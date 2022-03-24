package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.Designer;
import kr.hs.study.beans.Developer;
import kr.hs.study.beans.Publisher;

@Configuration
public class BeanConfigClass {
	
	@Bean
	public Designer emp1() {
		return new Designer(7, 10);
	}
	
	@Bean
	public Developer emp2() {
		return new Developer(10, 7);
	}
	
	@Bean
	public Publisher emp3() {
		return new Publisher(11, 6);
	}
}

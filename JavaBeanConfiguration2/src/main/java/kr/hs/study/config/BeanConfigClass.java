package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.TestBean1;

// �� ������ bean�� ������ ����ϴ� ����.
@Configuration
public class BeanConfigClass {
	
	// �Ʒ� �޼��带 ������ ���ϰ����� bean�� ������.
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

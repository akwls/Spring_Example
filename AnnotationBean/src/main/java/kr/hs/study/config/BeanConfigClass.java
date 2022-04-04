package kr.hs.study.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean1;
import kr.hs.study.beans.DataBean2;
import kr.hs.study.beans.DataBean3;
import kr.hs.study.beans.DataBean4;
import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;

@Configuration
public class BeanConfigClass {

//	@Bean
//	public DataBean1 d1() {
//		return new DataBean1();
//	}
//	@Bean
//	public DataBean2 d2() {
//		return new DataBean2();
//	}
//	@Bean
//	@Autowired
//	public TestBean1 t1() {
//		return new TestBean1();
//	}
	
//	@Bean
//	public DataBean1 xml1() {
//		return new DataBean1();
//	}
//	@Bean
//	public DataBean2 xml2() {
//		return new DataBean2();
//	}
//	@Bean
//	@Autowired
//	public TestBean2 t2() {
//		return new TestBean2();
//	}
	
	@Bean
	public DataBean3 d3() {
		return new DataBean3();
	}
	@Bean
	public DataBean4 d4() {
		return new DataBean4();
	}
	@Bean
	public TestBean3 t3() {
		return new TestBean3(d3(), d4());
	}
	
}

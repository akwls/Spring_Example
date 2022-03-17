package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.TestBean1;

@Configuration // �� ������ spring ��ü ������������ ���.
// config.xml�� ���Ұ� ����(bean ����)
public class BeanClassConfiguration {
	
	// �޼��� �̸� = id
	@Bean // �Ʒ� �޼��带 �����Ͽ� ��ü�� �����϶�.
	public TestBean1 t1() {
		TestBean1 t1 = new TestBean1(); // t1 ��ü ����
		return t1;
	}
	
	@Bean
	public TestBean1 t2() {
		return new TestBean1();
	}
}

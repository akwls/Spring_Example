package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {
	public void beforeMethod() {
		System.out.println("충고 advice 횡단관심사");
	}
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("around");
		pjp.proceed(); // 실제 핵심 메서드 실행
		System.out.println("around");
	}
}

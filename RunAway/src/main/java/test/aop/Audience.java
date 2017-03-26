package test.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class Audience {
	
	@Pointcut("execution(* test.aop.Performance.*(..))")
	public void performance() {}

	@Before("performance()")
	public void before(){
		System.out.println("before");
	}
	
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint jp) {
		try {
			System.out.println("Silencing cell phones");
			System.out.println("Taking seats");
			jp.proceed();
			System.out.println("CLAP CLAP CLAP");
		} catch (Throwable e) {
			// TODO: handle exception
			System.out.println("Demanding a refund");
		}
	}
}

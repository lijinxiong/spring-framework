package com.demo.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AspectJTest {



	@Pointcut("execution(* com.demo.aop.TestBean.test(..))")
	public void test(){

	}

	@Before("test()")
	public void before(){
		System.out.println("before");
	}

	@After("test()")
	public void after(){
		System.out.println("after");
	}

	@Around("test()")
	public void around(ProceedingJoinPoint proceedingJoinPoint) {

		System.out.println("around before");

		try {
			proceedingJoinPoint.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		System.out.println("around after");

	}



}

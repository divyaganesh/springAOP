package com.techexpert.springAOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	
	@Before("execution(* com.techexpert.springAOP.HiBye.*(..))")
	public void before(JoinPoint joinPoint) {
		System.out.println("entered "+joinPoint.getSignature().getName());
		
		
	}
	
	@After("execution(* com.techexpert.springAOP.HiBye.*(..))")
	public void after(JoinPoint joinPoint) {
		System.out.println("exit from "+joinPoint.getSignature().getName());
		
		
	}

}

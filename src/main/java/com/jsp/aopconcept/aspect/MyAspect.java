package com.jsp.aopconcept.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	@Before ("execution (* com.jsp.aopconcept.services.LoginImplement.login() )")
	public void beforeLoginAlgoX() {
		System.out.println("Login is being validated by Algo X...");
		
	}
	
	
	@After ("execution (* com.jsp.aopconcept.services.LoginImplement.login() )")
	public void afterLoginAlgoX() {
		System.out.println("Login is being validated by Algo X...");
		
	}
	
	

}

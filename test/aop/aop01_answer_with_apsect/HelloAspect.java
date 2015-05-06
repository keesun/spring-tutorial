package aop.aop01_answer_with_apsect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloAspect {

	@Pointcut("execution(* *..*.TargetService.*(..))")
	public void targetServicePointcut(){};
	
	@Before("targetServicePointcut()")
	public void before() {
		System.out.println("hello");
	}

}

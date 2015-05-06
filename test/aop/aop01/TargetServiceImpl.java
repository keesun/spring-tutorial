package aop.aop01;

import org.springframework.stereotype.Service;

@Service
public class TargetServiceImpl implements TargetService {

	public void doSomething() {
		System.out.println("do something");
	}
	
}

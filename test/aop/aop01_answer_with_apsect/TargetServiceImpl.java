package aop.aop01_answer_with_apsect;

import org.springframework.stereotype.Service;

@Service
public class TargetServiceImpl implements TargetService {

	public void doSomething() {
		System.out.println("do something");
	}
	
}

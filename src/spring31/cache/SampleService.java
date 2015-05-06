package spring31.cache;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class SampleService {
	
	@Cacheable("nickNames")
	public String nickName(String name) {
		System.out.println("===============called nickName method");
		return "!" + name + "!";
	}

	@CacheEvict("nickNames")
	public void addName(String name){
		//Stub
	}

}

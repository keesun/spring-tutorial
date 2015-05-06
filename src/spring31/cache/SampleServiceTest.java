package spring31.cache;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.Cache.ValueWrapper;
import org.springframework.cache.CacheManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("applicationContext.xml")
public class SampleServiceTest {
	
	@Autowired SampleService service;
	@Autowired CacheManager cacheManager;
	
	@Test
	public void di(){
		service.nickName("keesun");
		service.nickName("keesun");
	}

}

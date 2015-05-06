package ioc.ioc03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

	@Bean
	public SampleDao sampleDao(){
		return new SampleDao();
	}
	
	@Bean
	public SampleService sampleService(){
		return new SampleService();
	}
	
}

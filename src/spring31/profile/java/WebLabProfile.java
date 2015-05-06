package spring31.profile.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import spring31.profile.GandiService;
import spring31.profile.WebLabGandiService;

@Profile("weblab")
@Configuration
class WebLabProfile {
	@Bean
	public GandiService webLabGandiService(){
		return new WebLabGandiService();
	}
}

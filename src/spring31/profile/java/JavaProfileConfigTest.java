package spring31.profile.java;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring31.profile.GandiService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={AppConfig.class, KeesunProfile.class, WebLabProfile.class})
@ActiveProfiles("keesun")
public class JavaProfileConfigTest {
	
	@Autowired GandiService gandiService;
	
	@Test
	public void di(){
		assertThat(gandiService.name(), is("keesun"));
	}

}

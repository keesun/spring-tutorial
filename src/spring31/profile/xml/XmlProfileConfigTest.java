package spring31.profile.xml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring31.profile.GandiService;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("applicationContext.xml")
@ActiveProfiles("weblab")
public class XmlProfileConfigTest {
	
	@Autowired GandiService service;
	
	@Test
	public void di(){
		assertThat(service.name(), is("weblab"));
	}

}

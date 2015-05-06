package spring31.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseFactory;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.mail.MailSender;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import chapter06.exercise.aop12.DummyMailSender;
import chapter06.exercise.aop12.UserDao;
import chapter06.exercise.aop12.UserDaoJdbc;
import chapter06.exercise.aop12.UserService;
import chapter06.exercise.aop12.UserServiceImpl;
import chapter06.exercise.aop12.UserServiceTest.TestUserServiceImpl;

@Configuration
@EnableTransactionManagement
public class TestDaoConfg {
	
	@Bean
	public UserDao userDao(DataSource dataSource) {
		UserDaoJdbc userDaoJdbc = new UserDaoJdbc();
		userDaoJdbc.setDataSource(dataSource);
		return userDaoJdbc;
	}
	
	@Bean
	public UserService userService(UserDao userDao, MailSender mailSender){
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		userServiceImpl.setUserDao(userDao);
		userServiceImpl.setMailSender(mailSender);
		return userServiceImpl;
	}
	
	@Bean
	public UserService testUserService(UserDao userDao, MailSender mailSender){
		TestUserServiceImpl userServiceImpl = new TestUserServiceImpl();
		userServiceImpl.setUserDao(userDao);
		userServiceImpl.setMailSender(mailSender);
		return userServiceImpl;
	}
	
	@Bean
	public MailSender mailSender(){
		return new DummyMailSender();
	}
	
	@Bean
	public PlatformTransactionManager transactionManager(DataSource dataSource){
		return new DataSourceTransactionManager(dataSource); 
	}
	
	@Bean(destroyMethod="shutdown")
	public DataSource dataSource(){
		EmbeddedDatabaseFactory factory = new EmbeddedDatabaseFactory();
		factory.setDatabaseName("sample");
		factory.setDatabaseType(EmbeddedDatabaseType.HSQL);
		ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
		populator.addScript(new ClassPathResource("member_table_1.sql"));
		factory.setDatabasePopulator(populator);
		return factory.getDatabase();
	}
	

}

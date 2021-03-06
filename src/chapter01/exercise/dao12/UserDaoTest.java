package chapter01.exercise.dao12;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserDaoTest {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ApplicationContext applicationContext = new GenericXmlApplicationContext("/chapter01/exercise/dao12/daoContext.xml");
		UserDao userDao = applicationContext.getBean("userDao", UserDao.class);

		User user = new User();
		user.setId("whiteship");
		user.setName("백기선");
		user.setPassword("married");

		userDao.add(user);

		System.out.println("User 등록 성공!");

		User user2 = userDao.get("whiteship");
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());
		System.out.println(user2.getId() + " 조회 성공");
	}

}

package chapter05.exercise.abstraction04;

import java.util.List;

public interface UserDao {

	void deleteAll();

	int getCount();

	void add(User user);

	User get(String id);

	List<User> getAll();

	void update(User user);

}

package cn.vue.service;

import cn.vue.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService
{
	List<User> findAll();

	void saveUser(User user);

	void deleteUser(Integer id);

	User queryUser(Integer id);

	void updateUser(User user);

	List<User> queryUserByNameAndPhone(String username, String phone);
}

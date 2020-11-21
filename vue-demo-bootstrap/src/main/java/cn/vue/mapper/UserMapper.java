package cn.vue.mapper;

import cn.vue.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper
{
	//查询所有
	List<User> findAll();

	//保存
	void saveUser(User user);

	//删除
	void deleteUser(@Param("id") Integer id);

	//查询单个
	User queryUser(@Param("id") Integer id);

	//根据id修改
	void updateUser(User user);

	//模糊搜索
	List<User> queryUserByNameAndPhone(@Param("name") String name, @Param("phone") String phone);
}

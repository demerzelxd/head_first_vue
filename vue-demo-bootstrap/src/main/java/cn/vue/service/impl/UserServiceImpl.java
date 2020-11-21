package cn.vue.service.impl;

import cn.vue.domain.User;
import cn.vue.mapper.UserMapper;
import cn.vue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional //控制事务
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserMapper userMapper;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	//支持事务即可，不必开启事务
	public List<User> findAll()
	{
		return userMapper.findAll();
	}

	@Override
	public void saveUser(User user)
	{
		userMapper.saveUser(user);
	}

	@Override
	public void deleteUser(Integer id)
	{
		userMapper.deleteUser(id);
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public User queryUser(Integer id)
	{
		return userMapper.queryUser(id);
	}

	@Override
	public void updateUser(User user)
	{
		userMapper.updateUser(user);
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public List<User> queryUserByNameAndPhone(String name, String phone)
	{
		return userMapper.queryUserByNameAndPhone(name, phone);
	}
}

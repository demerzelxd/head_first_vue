package cn.me.controller;

import cn.me.domain.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("user")
@CrossOrigin
public class UserController
{
	@GetMapping("findAll")
	public List<User> findAll()
	{
		List<User> list = Arrays.asList(
				new User(1, "dada", 21, new Date()),
				new User(2, "gaga", 24, new Date()),
				new User(3, "nana", 35, new Date()));
		System.out.println("查询所有");
		return list;
	}
}

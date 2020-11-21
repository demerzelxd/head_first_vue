package cn.vue.controller;

import cn.vue.domain.User;
import cn.vue.service.UserService;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 后台端口8989，前台端口63342，端口不同算跨域
@CrossOrigin
@RestController
@RequestMapping("user")
public class UserController
{
	@Autowired
	private UserService userService;

	@GetMapping("findAll")
	public List<User> findAll()
	{
		return userService.findAll();
	}

	@PostMapping("save")
	public Map<String, Object> saveUser(@RequestBody @Valid User user)
	{
		// System.out.println(user);
		Map<String, Object> map = new HashMap<>();
		try
		{
			if (ObjectUtils.isEmpty(user.getId()))
			{
				//没有id，说明为插入
				userService.saveUser(user);
			} else
			{
				//有id，说明为更新
				userService.updateUser(user);
			}
			map.put("success", true);
		}
		catch (Exception e)
		{
			map.put("success", false);
			map.put("msg", "用户保存失败");
			e.printStackTrace();
		}
		return map;
	}

	@GetMapping("delete")
	public Map<String, Object> deleteUser(Integer id)
	{
		Map<String, Object> map = new HashMap<>();
		try
		{
			userService.deleteUser(id);
			map.put("success", true);
		}
		catch (Exception e)
		{
			map.put("success", false);
			map.put("msg", "删除用户失败");
			e.printStackTrace();
		}
		return map;
	}

	@GetMapping("query")
	public User queryUser(Integer id)
	{
		return userService.queryUser(id);
	}

	@GetMapping("search")
	public List<User> searchUser(String name, String phone)
	{
		return userService.queryUserByNameAndPhone(name, phone);
	}
}

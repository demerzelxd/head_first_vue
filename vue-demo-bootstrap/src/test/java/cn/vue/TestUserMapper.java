package cn.vue;

import cn.vue.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = VueDemoBootstrapApplication.class)
@RunWith(SpringRunner.class)
public class TestUserMapper
{
	@Autowired
	private UserMapper userMapper;

	@Test
	public void findAll()
	{
		userMapper.findAll().forEach(System.out::println);
	}
}

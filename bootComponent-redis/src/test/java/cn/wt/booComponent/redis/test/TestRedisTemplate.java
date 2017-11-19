package cn.wt.booComponent.redis.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import cn.wt.booComponent.redis.StartSpringBootMain;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest(classes = StartSpringBootMain.class)
public class TestRedisTemplate {
	@Resource
	private  RedisTemplate<String, String> redisTemplate;
	@Test
	public void testSet() {
		this.redisTemplate.opsForValue().set("mldn", "java");
	}
	@Test
	public void testGet() {
		System.err.println("当前保存的数据--" + this.redisTemplate.opsForValue().get("mldn"));
	}
}











package cn.wt.bootComponent.redis.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import cn.wt.bootComponent.redis.StartSpringBootMain;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest(classes = StartSpringBootMain.class)
public class TestRedisTemplate {
	@Resource(name="redisOne")
	private  RedisTemplate<String, String> redisOne;
	@Resource(name="redisTwo")
	private  RedisTemplate<String, String> redisTwo;
	@Test
	public void testSet() {
		this.redisTwo.opsForValue().set("mldnTwo", "javaTwo");
		this.redisOne.opsForValue().set("mldnOne", "javaOne");
	}
	@Test
	public void testGet() {
		System.err.println("当前保存的数据--" + this.redisOne.opsForValue().get("mldnOne"));
		System.err.println("当前保存的数据--" + this.redisTwo.opsForValue().get("mldnTwo"));
	}
}

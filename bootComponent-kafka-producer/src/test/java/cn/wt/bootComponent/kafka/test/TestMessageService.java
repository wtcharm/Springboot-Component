package cn.wt.bootComponent.kafka.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import cn.wt.bootComponent.kafka.StartSpringBootMain;
import cn.wt.bootComponent.kafka.service.IMessageService;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration	//现在要使用一个WEB程序启动
@SpringBootTest(classes = StartSpringBootMain.class)	//定义要测试的类
public class TestMessageService {
	static {	//验证
		System.setProperty("java.security.auth.login.config", 
				"d:/kafka_client_jaas.conf");
	}
	@Resource
	private IMessageService messageService;
	@Test
	public void send() {
		this.messageService.send("你好帅！！ 今天学的不错");
	}
	
}
package cn.wt.bootComponent.rabbitmq.test;

import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import cn.wt.bootComponent.rabbitmq.StartSpringBootMain;
import cn.wt.bootComponent.rabbitmq.service.IMessageService;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration		//现在要使用一个web程序启动
@SpringBootTest(classes = StartSpringBootMain.class)	//定义要测试的类
public class TestMessageService {
	@Resource
	private IMessageService messageService;
	@Test
	public void testSendMessage() {
		this.messageService.sendMessage("nihao----");
	}
}

package cn.wt.bootComponent.rabbitmq.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageComponentLisrtener {
	@RabbitListener(queues="cn.wt.queue")
	public void receviveMessage(String text) {
		System.err.println("【**接收消息 *** 】" + text );
	}
}

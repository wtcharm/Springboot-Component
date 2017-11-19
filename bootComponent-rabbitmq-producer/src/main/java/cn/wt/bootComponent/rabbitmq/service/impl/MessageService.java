package cn.wt.bootComponent.rabbitmq.service.impl;

import javax.annotation.Resource;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import cn.wt.bootComponent.rabbitmq.config.ProducerConfig;
import cn.wt.bootComponent.rabbitmq.service.IMessageService;
@Service
public class MessageService implements IMessageService {
	@Resource
	private RabbitTemplate rabbitTemplat;
	@Override
	public void sendMessage(String msg) {
		this.rabbitTemplat.convertAndSend(ProducerConfig.EXCHANGE,ProducerConfig.ROUTINGKEY,msg);
	}
}

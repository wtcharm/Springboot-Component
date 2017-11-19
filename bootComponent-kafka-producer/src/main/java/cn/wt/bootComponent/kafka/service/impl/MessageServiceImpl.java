package cn.wt.bootComponent.kafka.service.impl;

import javax.annotation.Resource;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import cn.wt.bootComponent.kafka.service.IMessageService;
@Service
public class MessageServiceImpl implements IMessageService{
	@Resource
	private KafkaTemplate<String, String> kafkarTemplate;
	@Override
	public void send(String msg) {
		System.out.println("*** 发送消息中**");
		this.kafkarTemplate.sendDefault("mldn-key",msg);	
	}
}

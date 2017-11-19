package cn.wt.bootComponent.kafka.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageComponentListener {
	static {	//验证
		System.setProperty("java.security.auth.login.config", 
				"d:/kafka_client_jaas.conf");
	}
	@KafkaListener(topics= {"mldn-microboot"})
	public void recevieMessage(ConsumerRecord<String, String> record) {
		System.err.println("【*** 接收消息 ***】 key = " + record.key() + "、value = " + record.value());
	} 
}

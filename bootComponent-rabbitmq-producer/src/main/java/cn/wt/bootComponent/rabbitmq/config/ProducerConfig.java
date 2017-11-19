package cn.wt.bootComponent.rabbitmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProducerConfig {
	public static final String EXCHANGE = "cn.wt.exchange";
	public static final String ROUTINGKEY = "cn.wt.routingkey";
	public static final String QUEUE_NAME ="cn.wt.queue";
	@Bean
	public DirectExchange getDirectExchange() {	//绑定Exchange
		return new DirectExchange(EXCHANGE);
	}
	@Bean
	public Queue getQueue() {
		return new Queue(QUEUE_NAME);
	}
	@Bean
	public Binding bindingExchangeQueue(DirectExchange exchange,Queue queue){//绑定要进行的交换空间与队列关系
		return BindingBuilder.bind(queue).to(exchange).with(ROUTINGKEY);
	}
}






























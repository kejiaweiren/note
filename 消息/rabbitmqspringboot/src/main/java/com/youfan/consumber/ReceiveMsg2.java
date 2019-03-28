package com.youfan.consumber;

import com.youfan.config.RabbitConfigure2;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveMsg2 {

    /**
     * === 在RabbitMQ上创建queue,exchange,binding 方法二：直接在@RabbitListener声明 begin ===
     * 接收
     * @param content
     */
    @RabbitListener(queues = RabbitConfigure2.SPRING_BOOT_QUEUE)
    public void receive_2(String content) {
        // ...
        System.out.println("[ReceiveMsg-2] receive msg: " + content);
    }

}

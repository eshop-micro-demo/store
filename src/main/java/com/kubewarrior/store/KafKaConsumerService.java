package com.kubewarrior.store;

import com.kubewarrior.checkout.domain.Userorder;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafKaConsumerService {

    @KafkaListener(topics = "checkout_topic_new", groupId = "group_id")
    public void consume(Userorder order)
    {
        System.out.println("### Msg received. Product id: " + order.getProductId());
    }
}

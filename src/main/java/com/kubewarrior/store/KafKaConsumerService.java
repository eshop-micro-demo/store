package com.kubewarrior.store;

import javax.transaction.Transactional;

import com.kubewarrior.checkout.domain.Userorder;
import com.kubewarrior.store.domain.Product;
import com.kubewarrior.store.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafKaConsumerService {

    @Autowired
    private ProductRepository repository;

    @Transactional
    @KafkaListener(topics = "checkout_topic_new", groupId = "group_id")
    public void consume(Userorder order)
    {
        System.out.println("### Msg received. Product id: " + order);
        Product p = repository.findById(order.getProductId()).get();
        p.setStockCount(p.getStockCount()-order.getQuantity());
        System.out.println("### New stock count" + p.getStockCount());
        repository.save(p);
    }
}

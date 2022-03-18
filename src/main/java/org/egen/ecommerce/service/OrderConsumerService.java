package org.egen.ecommerce.service;

import org.egen.ecommerce.dto.OrderDto;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumerService {

  @KafkaListener(topics = "orders")
  public void consume(OrderDto orderDto) {
    System.out.println(orderDto + "");
  }
}

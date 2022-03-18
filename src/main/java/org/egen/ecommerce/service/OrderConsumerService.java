package org.egen.ecommerce.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.egen.ecommerce.client.OrdersClient;
import org.egen.ecommerce.dto.OrderDto;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class OrderConsumerService {

  private final OrdersClient ordersClient;

  @KafkaListener(topics = "orders")
  public void consume(OrderDto orderDto) {
    try {
      ordersClient.postOrder(orderDto);
    } catch (Exception e) {
      //TODO Handle failure scenarios
      log.error("Failed to import the order {} " , orderDto);
    }

  }
}

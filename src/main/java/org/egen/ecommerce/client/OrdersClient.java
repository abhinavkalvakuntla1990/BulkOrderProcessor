package org.egen.ecommerce.client;

import lombok.AllArgsConstructor;
import org.egen.ecommerce.config.OrdersProperties;
import org.egen.ecommerce.dto.OrderDto;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@AllArgsConstructor
public class OrdersClient {

    private final OrdersProperties ordersProperties;

    public void postOrder(OrderDto orderDto) {
        new RestTemplate().postForEntity(ordersProperties.getUrl(), orderDto, String.class);
    }
}

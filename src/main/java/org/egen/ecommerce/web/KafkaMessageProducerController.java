package org.egen.ecommerce.web;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.egen.ecommerce.dto.OrderDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/v1/message")
@Tag(name="Messages")
public class KafkaMessageProducerController {

  private final KafkaTemplate<String, OrderDto> kafkaTemplate;

  @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  @ResponseStatus(HttpStatus.CREATED)
  public void sendMessage(@RequestBody @Valid OrderDto orderDto) {
    kafkaTemplate.send("orders", orderDto);
  }

}

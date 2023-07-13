package com.kafka.provider.controller;

import com.kafka.provider.dto.KafkaMessageDto;
import com.kafka.provider.dto.KafkaResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kafka")
@CrossOrigin(origins = "*")
public class KafkaController {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping
    public ResponseEntity<KafkaResponseDto> readMessage(@RequestBody KafkaMessageDto message) {
        kafkaTemplate.send("SpringTopic-one", message.getMessage());
        return ResponseEntity.ok( new KafkaResponseDto("Success") );
    }

}

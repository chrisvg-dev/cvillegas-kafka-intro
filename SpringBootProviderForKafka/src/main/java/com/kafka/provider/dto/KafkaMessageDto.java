package com.kafka.provider.dto;

public class KafkaMessageDto {
    private String message;

    public KafkaMessageDto(String message) {
        this.message = message;
    }

    public KafkaMessageDto() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

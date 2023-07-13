package com.kafka.provider.dto;

public class KafkaResponseDto {
    private String message;

    public KafkaResponseDto(String message) {
        this.message = message;
    }

    public KafkaResponseDto() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

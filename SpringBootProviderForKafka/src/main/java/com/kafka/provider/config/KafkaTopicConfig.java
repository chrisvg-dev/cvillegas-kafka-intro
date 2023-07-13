package com.kafka.provider.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.config.TopicConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic generateTopic() {
        Map<String, String> map = new HashMap<>();

        // Define si el mensaje se borrará (delete) o si mantendrá (compact) solo el mas actual
        map.put(TopicConfig.CLEANUP_POLICY_CONFIG, TopicConfig.CLEANUP_POLICY_DELETE);
        // Duracion dentro del topic, por defecto el -1 hace que no se borre nunca
        map.put(TopicConfig.RETENTION_MS_CONFIG, "86400000");
        // Define segment maximum size in bytes - 1GB
        map.put(TopicConfig.SEGMENT_BYTES_CONFIG, "1073741824");
        // Messages max size
        map.put(TopicConfig.MAX_MESSAGE_BYTES_CONFIG, "1000012");

         return TopicBuilder.name("SpringTopic-one")
                 .partitions(2)
                 .replicas(1)
                 .configs(map)
                 .build();
    }

}

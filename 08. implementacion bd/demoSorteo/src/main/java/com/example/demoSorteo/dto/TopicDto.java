package com.example.demoSorteo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TopicDto {
    private Long id;
    @JsonProperty("topic_name")
    private String topicName;
    private String complexity;
}

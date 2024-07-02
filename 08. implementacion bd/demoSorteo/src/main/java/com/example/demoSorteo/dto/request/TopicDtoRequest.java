package com.example.demoSorteo.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TopicDtoRequest {

    @JsonProperty("topic_name")
    private String topicName;
    private String complexity;
}

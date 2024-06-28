package com.example.demoSorteo.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TopicDtoResponse {

    @JsonProperty("topic_name")
    private String topicName;
    private String complexity;
}

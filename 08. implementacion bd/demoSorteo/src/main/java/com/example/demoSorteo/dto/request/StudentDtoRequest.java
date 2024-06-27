package com.example.demoSorteo.dto.request;

import com.example.demoSorteo.dto.TopicDto;
import com.example.demoSorteo.model.Topic;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class StudentDtoRequest {

    private String name;
    @JsonProperty("sur_name")
    private String surName;
    private String dni;
    private String course;

    @JsonProperty("topic_id")
    private TopicDto topic;

}

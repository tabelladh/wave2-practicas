package com.example.demoSorteo.service;

import com.example.demoSorteo.dto.request.StudentDtoRequest;
import com.example.demoSorteo.dto.request.TopicDtoRequest;
import com.example.demoSorteo.dto.response.StudentDtoResponse;
import com.example.demoSorteo.dto.response.TopicDtoResponse;

public interface ITopicService {

    TopicDtoResponse saveTopic(TopicDtoRequest topicDtoRequest);

}

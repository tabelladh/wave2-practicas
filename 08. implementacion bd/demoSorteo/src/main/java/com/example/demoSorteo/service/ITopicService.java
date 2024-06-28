package com.example.demoSorteo.service;

import com.example.demoSorteo.dto.TopicDto;

import java.util.List;

public interface ITopicService {

    TopicDto saveTopic(TopicDto topicDto);

    TopicDto findTopic(Long id);

    List<TopicDto> topicsList();

}

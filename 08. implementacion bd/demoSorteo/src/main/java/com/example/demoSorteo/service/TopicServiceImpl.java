package com.example.demoSorteo.service;

import com.example.demoSorteo.dto.request.TopicDtoRequest;
import com.example.demoSorteo.dto.response.TopicDtoResponse;
import com.example.demoSorteo.dto.response.TopicDtoResponse;
import com.example.demoSorteo.model.Topic;
import com.example.demoSorteo.repository.ITopicRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicServiceImpl implements ITopicService {
    
    @Autowired
    private ITopicRepository topicRepository;

    @Autowired
    private ModelMapper modelMapper;
    
    @Override
    public TopicDtoResponse saveTopic(TopicDtoRequest topicDtoRequest) {
        Topic topic = new Topic();
        modelMapper.map(topicDtoRequest, topic);

        topicRepository.save(topic);

        TopicDtoResponse topicDtoResponse = new TopicDtoResponse();
        modelMapper.map(topic, topicDtoResponse);

        return topicDtoResponse;
    }
}

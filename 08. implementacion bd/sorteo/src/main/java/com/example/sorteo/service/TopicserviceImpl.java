package com.example.sorteo.service;

import com.example.sorteo.dto.TopicDto;
import com.example.sorteo.entity.Student;
import com.example.sorteo.entity.Topic;
import com.example.sorteo.repository.TopicRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicserviceImpl implements iTopicService{

    @Autowired
    TopicRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<TopicDto> findAllTopic() {
        TopicDto topicDto = new TopicDto();
        List<Topic> topics = repository.findAll();
        List<TopicDto>topicsDtos = List.of();

        for (Topic topic: topics){
            modelMapper.map(topic,topicDto);
            topicsDtos.add(topicDto);
        }
        return topicsDtos;
    }
}

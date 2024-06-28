package com.example.demoSorteo.service;

import com.example.demoSorteo.dto.TopicDto;
import com.example.demoSorteo.exceptions.registroInexistenteException;
import com.example.demoSorteo.model.Topic;
import com.example.demoSorteo.repository.ITopicRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicServiceImpl implements ITopicService {
    
    @Autowired
    private ITopicRepository topicRepository;

    @Autowired
    private ModelMapper modelMapper;
    
    @Override
    public TopicDto saveTopic(TopicDto topicDto) {
        Topic topic = new Topic();
        modelMapper.map(topicDto, topic);

        topicRepository.save(topic);

        modelMapper.map(topic, topicDto);

        return topicDto;
    }

    @Override
    public TopicDto findTopic(Long id) {
        Optional<Topic> topic = topicRepository.findById(id);

        if (topic.isPresent()) {
            return modelMapper.map(topic, TopicDto.class);
        }else {
            throw new registroInexistenteException();
        }

    }

    @Override
    public List<TopicDto> topicsList() {
        return topicRepository.findAll().stream()
                .map(topic -> modelMapper.map(topic, TopicDto.class))
                .toList();
    }
}

package com.example.demoSorteo.controller;

import com.example.demoSorteo.dto.TopicDto;
import com.example.demoSorteo.service.ITopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topic")
public class TopicController {

    @Autowired
    private ITopicService topicService;

    @PostMapping("/new")
    public ResponseEntity<TopicDto> saveTopic(@RequestBody TopicDto topicDto) {
        return new ResponseEntity<>(topicService.saveTopic(topicDto), HttpStatus.CREATED);
    }
}

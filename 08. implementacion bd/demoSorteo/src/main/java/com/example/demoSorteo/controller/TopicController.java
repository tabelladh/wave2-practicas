package com.example.demoSorteo.controller;

import com.example.demoSorteo.dto.request.TopicDtoRequest;
import com.example.demoSorteo.dto.response.TopicDtoResponse;
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
    public ResponseEntity<TopicDtoResponse> saveTopic(@RequestBody TopicDtoRequest topicDtoRequest) {
        return new ResponseEntity<>(topicService.saveTopic(topicDtoRequest), HttpStatus.CREATED);
    }
}

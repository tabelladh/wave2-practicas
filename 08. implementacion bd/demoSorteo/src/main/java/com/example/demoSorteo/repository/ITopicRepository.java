package com.example.demoSorteo.repository;

import com.example.demoSorteo.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITopicRepository extends JpaRepository<Topic, Long> {
}

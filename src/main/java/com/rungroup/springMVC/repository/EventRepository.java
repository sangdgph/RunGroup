package com.rungroup.springMVC.repository;

import com.rungroup.springMVC.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {

}

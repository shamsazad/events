package com.hostele.events.repository;

import com.hostele.events.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, String>{
}

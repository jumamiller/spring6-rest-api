package com.jitu.springboot.tickets.repositories;

import com.jitu.springboot.tickets.models.events.Event;
import com.jitu.springboot.tickets.models.events.Organizer;
import com.jitu.springboot.tickets.models.events.Venue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface EventRepository extends JpaRepository<Event,Long> {
}

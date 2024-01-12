package com.jitu.springboot.tickets.controllers;

import com.jitu.springboot.tickets.models.events.Event;
import com.jitu.springboot.tickets.models.events.Organizer;
import com.jitu.springboot.tickets.models.events.Product;
import com.jitu.springboot.tickets.repositories.EventRepository;
import com.jitu.springboot.tickets.repositories.OrganizerRepository;
import com.jitu.springboot.tickets.repositories.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class EventController {
    private final OrganizerRepository organizerRepository;
    private final EventRepository eventRepository;
    private final ProductRepository productRepository;

    public EventController(OrganizerRepository organizerRepository, EventRepository eventRepository, ProductRepository productRepository) {
        this.organizerRepository = organizerRepository;
        this.eventRepository = eventRepository;
        this.productRepository = productRepository;
    }
    @GetMapping("/organizers")
    public List<Organizer> getOrganizers() {
        return organizerRepository.findAll();
    }
}

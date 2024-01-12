package com.jitu.springboot.tickets.controllers;

import com.jitu.springboot.tickets.models.events.Event;
import com.jitu.springboot.tickets.models.events.Organizer;
import com.jitu.springboot.tickets.models.events.Product;
import com.jitu.springboot.tickets.repositories.EventRepository;
import com.jitu.springboot.tickets.repositories.OrganizerRepository;
import com.jitu.springboot.tickets.repositories.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.ErrorResponse;
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
    @GetMapping("/events")
    public List<Event> getEventsByOrganizer(@RequestParam("organizerId") int organizerId) {
        return eventRepository.findByOrganizerId(organizerId);
    }
    @GetMapping("/events/{id}")
    public Event getEventById(@PathVariable("id") int eventId) {
        return eventRepository.findById(eventId)
                .orElseThrow(()->new NoSuchElementException("EVent with id "+eventId +" not found"));
    }
    @GetMapping("/products")
    public List<Product> getProductsByEvent(@RequestParam("eventId") int eventId) {
        return productRepository.findByEventId(eventId);
    }
}

package com.jitu.springboot.tickets.models.events;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "events")
public class Event{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private int id;
    @Column(nullable = false) private String name;
    @ManyToOne(optional = false) @JoinColumn(name="organizer_id",referencedColumnName = "id",nullable = false) private Organizer organizer;
    @ManyToOne(optional = false)  @JoinColumn(name="venue_id",referencedColumnName = "id",nullable = false) private Venue venue;
    @Column(name = "start_date") private LocalDate startDate;
    @Column(name = "end_date") private LocalDate endDate;

}
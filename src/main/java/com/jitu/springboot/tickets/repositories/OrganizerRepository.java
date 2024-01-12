package com.jitu.springboot.tickets.repositories;

import com.jitu.springboot.tickets.models.events.Organizer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface OrganizerRepository extends JpaRepository<Organizer,Long> {
}
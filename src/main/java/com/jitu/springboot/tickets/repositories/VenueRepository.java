package com.jitu.springboot.tickets.repositories;

import com.jitu.springboot.tickets.models.events.Venue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface VenueRepository extends JpaRepository<Venue,Long> {
}

package com.jitu.springboot.tickets.repositories;

import com.jitu.springboot.tickets.models.events.Venue;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class VenueRepository {
    private final List<Venue> venues=List.of(
            new Venue(201,"Globomantics Main Office","Gakere Road 32","Nyeri Town","Kenya"),
            new Venue(202,"Sea View Hotel","Beach Boulevard 867","Los Angeles","USA")
    );
    public Optional<Venue> findById(int id) {
        return venues.stream().filter(item->item.id() == id).findAny();
    }
}

package com.jitu.springboot.tickets.repositories;

import com.jitu.springboot.tickets.models.events.Event;
import com.jitu.springboot.tickets.models.events.Organizer;
import com.jitu.springboot.tickets.models.events.Venue;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public class EventRepository {
    private final List<Event> events=List.of(
            new Event(501,"Globomantics Tech Conference",
                    new Organizer(101,"Globomantics","Globamantics Technology Coorporation"),
                    new Venue(201,"Globomantics Main Office","Gakere Road 32","Nyeri Town","Kenya"),
                    LocalDate.of(2024,1,12),
                    LocalDate.of(2024,1,20)));
    public List<Event> findByOrganizerId(int organizerId) {
        return events.stream().filter(item-> item.organizer().id() == organizerId).toList();
    }
    public Optional<Event> findById(int id) {
        return events.stream().filter(item->item.id() == id).findAny();
    }
}

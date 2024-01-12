package com.jitu.springboot.tickets.repositories;

import com.jitu.springboot.tickets.models.events.Organizer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrganizerRepository {
    private final List<Organizer> organizers=List.of(
            new Organizer(101,"Globomantics","Globamantics Technology Coorporation"),
            new Organizer(102,"Carved Rock","Carved Rock Sports Equipment")
    );
    public List<Organizer> findAll() {
        return organizers;
    }
}

package com.jitu.springboot.tickets.controllers;

import com.jitu.springboot.tickets.models.registration.Registration;
import com.jitu.springboot.tickets.repositories.RegistrationRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;
import java.util.UUID;

@RestController
@RequestMapping(path = "/registrations")
public class RegistrationController {
    private final RegistrationRepository registrationRepository;

    public RegistrationController(RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }
    @PostMapping
    public Registration create(@RequestBody @Valid Registration registration) {
        String ticketCode= UUID.randomUUID().toString();
        return registrationRepository.save(new Registration(
                null,registration.productId(),ticketCode,registration.attendeeName()
        ));
    }
    @PatchMapping
    public Registration update(@RequestBody Registration registration) {
        String ticketCode=registration.ticketCode();
        var existing=registrationRepository.findByTicketCode(ticketCode)
                .orElseThrow(() -> new NoSuchElementException("Registration with ticket code " + ticketCode + " not found"));
        return registrationRepository.save(new Registration(
                existing.id(),existing.productId(),ticketCode,registration.attendeeName()
        ));
    }
}

package com.jitu.springboot.tickets.models.registration;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("registrations")
public record  Registration(
        @Id String id,
        @NotNull(message = "Product id is required") int productId,
        String ticketCode,
        @NotBlank String attendeeName)
{}

package com.jitu.springboot.tickets.repositories;

import com.jitu.springboot.tickets.models.events.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
}

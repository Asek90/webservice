package com.example.demo.repository;

import com.example.demo.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface PizzaJpaRepository extends JpaRepository<Pizza,Long> {
    Pizza findByName(String name);
}

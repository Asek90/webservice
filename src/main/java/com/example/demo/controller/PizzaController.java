package com.example.demo.controller;

import com.example.demo.model.Pizza;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.example.demo.repository.PizzaJpaRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/pizza", produces = MediaType.APPLICATION_JSON_VALUE)
public class PizzaController {

    @Autowired
    private PizzaJpaRepository pizzaJpaRepository;

    @GetMapping(value = "/allpizza")
    public List<Pizza> getAllPizza(){
      return pizzaJpaRepository.findAll();
    }
    @GetMapping(value = "/{name}")
    public Pizza getPizzaByName(@PathVariable final String name){
        return pizzaJpaRepository.findByName(name);
    }
    @PostMapping(value = "/load")
        public Pizza load(@RequestBody final Pizza pizza){
        pizzaJpaRepository.save(pizza);
        return pizzaJpaRepository.findByName(pizza.getName());
    }
    @DeleteMapping(value = "/{id}")
    public String deletePizza(@PathVariable Long id){
        pizzaJpaRepository.deleteById(id);
        return "Pizza deleted";
    }


}

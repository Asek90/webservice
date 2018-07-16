package com.example.demo.bootstrap;

import com.example.demo.model.Pizza;
import com.example.demo.repository.PizzaJpaRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private PizzaJpaRepository pizzaJpaRepository;

    public Bootstrap(PizzaJpaRepository pizzaJpaRepository) {
        this.pizzaJpaRepository = pizzaJpaRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
    initData();

    }
    private void initData(){
        Pizza pizza1 = new Pizza("hawajska",22.50,"Ananas,Szynka");
        Pizza pizza2 = new Pizza("pepperoni",25.50,"Pepperoni,Jalapeno");
        pizzaJpaRepository.save(pizza1);
        pizzaJpaRepository.save(pizza2);
    }
}

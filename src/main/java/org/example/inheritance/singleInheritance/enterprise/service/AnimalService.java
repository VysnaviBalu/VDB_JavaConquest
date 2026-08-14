package org.example.inheritance.singleInheritance.enterprise.service;

import org.example.inheritance.singleInheritance.enterprise.domain.Animal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Application- layer service : owns the lifecyle of Animal instance and
 * separates business logic from domain objects
 */
@Service
public class AnimalService {
    private static final Logger log = LoggerFactory.getLogger(AnimalService.class);

    private final Map<String, Animal> registry = new ConcurrentHashMap<>();

    public void register (Animal animal){
        Objects.requireNonNull(animal, "animal");
        registry.put(animal.getId(),animal);
        log.info("Registered Animal: {}", animal);
    }

    public Optional<Animal> findById(String id){
        return Optional.ofNullable(registry.get(id));
    }

    public List<Animal> findAll(){
        return Collections.unmodifiableList(new ArrayList<>(registry.values()));
    }

    public String performSound(Animal animal){
        String sound = animal.makeSound();
        log.debug("Animal {} make sound {}", animal.getId(), sound);
        return sound;
    }
}

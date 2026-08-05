package org.example.inheritance.service;

import org.example.inheritance.domain.AnimalEnter;
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
public class AnimalEnterService {
    private static final Logger log = LoggerFactory.getLogger(AnimalEnterService.class);

    private final Map<String, AnimalEnter> registry = new ConcurrentHashMap<>();

    public void register (AnimalEnter animal){
        Objects.requireNonNull(animal, "animal");
        registry.put(animal.getId(),animal);
        log.info("Registered Animal: {}", animal);
    }

    public Optional<AnimalEnter> findById(String id){
        return Optional.ofNullable(registry.get(id));
    }

    public List<AnimalEnter> findAll(){
        return Collections.unmodifiableList(new ArrayList<>(registry.values()));
    }

    public String performSound(AnimalEnter animal){
        String sound = animal.makeSound();
        log.debug("Animal {} make sound {}", animal.getId(), sound);
        return sound;
    }
}

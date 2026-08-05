package org.example.inheritance;

import org.example.inheritance.domain.AnimalDogEnter;
import org.example.inheritance.service.AnimalEnterService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AnimalMainEnter {

    public static void main(String[] args){
        ApplicationContext ctx = SpringApplication.run(AnimalMainEnter.class, args);

        AnimalEnterService service = ctx.getBean(AnimalEnterService.class);

        AnimalDogEnter rex = new AnimalDogEnter("Rex","Labrador");
        service.register(rex);

        service.findById(rex.getId()).ifPresent(a ->
                System.out.println(service.performSound(a)));

        System.out.println(rex.fetch("ball"));
        System.out.printf("All Animals: %s%n", service.findAll());
    }
}

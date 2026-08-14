package org.example.inheritance.singleInheritance.enterprise;

import org.example.inheritance.singleInheritance.enterprise.domain.AnimalDog;
import org.example.inheritance.singleInheritance.enterprise.service.AnimalService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AnimalMain {

    public static void main(String[] args){
        ApplicationContext ctx = SpringApplication.run(AnimalMain.class, args);

        AnimalService service = ctx.getBean(AnimalService.class);

        AnimalDog rex = new AnimalDog("Rex","Labrador");
        service.register(rex);

        service.findById(rex.getId()).ifPresent(a ->
                System.out.println(service.performSound(a)));

        System.out.println(rex.fetch("ball"));
        System.out.printf("All Animals: %s%n", service.findAll());
    }
}

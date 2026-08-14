package org.example.polymorphism.enterprise;

import org.example.polymorphism.enterprise.service.ReportProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.List;

@SpringBootApplication
public class ReportMain {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ReportMain.class, args);
        ReportProcessor rp = ctx.getBean(ReportProcessor.class);

        System.out.println(rp.sumAsDouble(List.of(1, 2, 3)));       // Integer -> Number bound
        System.out.println(rp.sumAsDouble(List.of(1.5, 2.5)));      // Double -> Number bound

        List<String> labels = rp.transform(List.of(1, 2, 3), n -> "item-" + n);
        System.out.println(labels);

        System.out.println(rp.total(new int[]{10, 20}));
        System.out.println(rp.totalNamed("Q1", 100, 200));
    }
}
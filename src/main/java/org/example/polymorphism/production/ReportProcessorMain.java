package org.example.polymorphism.production;

import java.util.List;
public class ReportProcessorMain {
    public static void main(String[] args){
        ReportProcessor rp = new ReportProcessor();

        System.out.println(rp.total(new int[]{10,20,30}));
        System.out.println(rp.total("Q1 Sales", 100, 200, 300));
        System.out.println(rp.count(List.of("Shiv","Meena","Padma")));

        rp.process(List.of(2,3,4),n-> System.out.println("Doubled: "+(n*2)));
        rp.process(List.of(2,3,4),n-> System.out.println("Add 2: "+(n+2)));
    }
}

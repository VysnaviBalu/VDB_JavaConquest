package org.example.polymorphism.production;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.function.Consumer;
public class ReportProcessor {
    private static Logger log = LoggerFactory.getLogger(ReportProcessor.class);

    // Array version
    public int total(int[] values){
        int sum = 0;
        if(values == null || values.length == 0){
            throw new IllegalArgumentException("values must not be empty!");
        }
        for(int v: values){sum+= v;}
        log.info("Totalled {} values is {}", values.length, sum);
        return sum;
    }

    // Varags version - Different name avoided here on purpose
    // shown separately from Array overload to avoid ambuigity
    public int total(String label, int...values){
        int sum = 0;
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Values must not be empty!");
        }
        for(int v: values){ sum+= v;}
        return sum;
    }

    public <T> int count (List<T> items){
        if (items == null){
            throw new IllegalArgumentException("Items should not be null!");
        }
        return items.size();
    }

    // Functional interface param - behaviour passed in, not the data
    public void process(List<Integer> nums, Consumer<Integer> action){
        for(int n: nums) action.accept(n);
    }
}

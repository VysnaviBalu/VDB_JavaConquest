package org.example.polymorphism.enterprise.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

/**
 * Enterprise style processor: bounded generics, functional composition,
 * and deliberate avoidance of Overload ambiguity traps (no two methods
 * differing only by erased generic type, no-accidental null reference
 * ambiguity)
 */
@Service
public class ReportProcessor {
    private static final Logger log = LoggerFactory.getLogger(ReportProcessor.class);

    // Bounded generic: T must be a number so we can safely call doubleValue()
    public <T extends Number> double sumAsDouble(List<T> values){
        Objects.requireNonNull(values, "Values");
        double total = values.stream().mapToDouble(Number::doubleValue).sum();
        log.info("Summed {} numeric values -> {}", values.size(),total);
        return total;
    }

    /**
     * Named distinctly (not overload) to avoid list vs List erasure clash
     * This is the real enterprise pattern
     * When overloading on generic type would collide, rename instead
     */

    public <R> List<R> transform(List<Integer> nums, Function<Integer, R> mapper){
        Objects.requireNonNull(mapper,"mapper");
        return nums.stream().map(mapper).toList();
    }

    /**
     * Deliberately explicit overload set - array vs varags kept separate
     * by giving varags version an extra required parameter, avoiding
     * the resolution-order trap entirely
     */

    public int total(int[] values){
        int sum=0;
        for(int v: values) sum+= v;
        return sum;
    }

    public int totalNamed(String label, int...values){
        int sum=0;
        for(int v: values) sum+= v;
        return sum;
    }
}

package org.example.polymorphism;

import org.example.polymorphism.enterprise.service.ReportProcessor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

@DisplayName("ReportProcessor")
public class ReportProcessorTest {

    private ReportProcessor processor;

    @BeforeEach
    void setup(){
        processor = new ReportProcessor();
    }

    @Test
    @DisplayName("sums integer via bounded generic method")
    void sumAsDouble_Integers(){
        assertThat(processor.sumAsDouble(List.of(1,2,3))).isEqualTo(6.0);
    }

    @Test
    @DisplayName("sums double via SAME bounded generic method")
    void sumAsDouble_Doubles(){
        assertThat(processor.sumAsDouble(List.of(2.0,5.0))).isEqualTo(7.0);
    }

    @Test
    @DisplayName("sums long via SAME bounded generic method")
    void sumAsDouble_Long(){
        assertThat(processor.sumAsDouble(List.of(3L,2L))).isEqualTo(5L);
    }

    @Test
    @DisplayName("sums negative via SAME bounded generic method")
    void sumAsDouble_Negatives(){
        assertThat(processor.sumAsDouble(List.of(-3,-9))).isEqualTo(-12);
    }

//    @Test - Shows error as T is Number and cannot accept String, int , char etc
//    @DisplayName("throws on null list instead of IAE deep in the stream")
//    void sumAsDouble_String(){
//        assertThatThrownBy(()-> processor.sumAsDouble("Vysh"))
//                .isInstanceOf(IllegalArgumentException.class);
//    }
    @Test
    @DisplayName("throws on null list  instead of NPE deep in stream")
    void sumAsDouble_nullThrowsCleanly(){
       assertThatThrownBy(()->processor.sumAsDouble(null))
               .isInstanceOf(NullPointerException.class);
    }

    @Test
    @DisplayName("transform maps each element using function to append String")
    void transform_appliesStringMapper(){
        List<String> result = processor.transform(List.of(1,2,3), n-> "item-"+n);
        assertThat(result).containsExactly("item-1","item-2","item-3");
    }

    @Test
    @DisplayName("transform maps each element using function to add 2")
    void transform_appliesIntegerMapper(){
        List<Integer> result = processor.transform(List.of(2,3,4), n-> n+2);
        assertThat(result).containsExactly(4,5,6);
    }

    @Test
    @DisplayName("total sums a plain int array")
    void total_IntArray(){
        assertThat(processor.total(new int[]{10,20,30})).isEqualTo(60);
    }

    @Test
    @DisplayName("throws on null instead of NPE")
    void total_NullThrowsCleanly(){
        assertThatThrownBy(()-> processor.total(null))
                .isInstanceOf(NullPointerException.class);
    }

    @Test
    @DisplayName("totalNamed sums varargs correctly")
    void totalNamed_varargs() {
        assertThat(processor.totalNamed("Q1", 100, 200, 300)).isEqualTo(600);
    }

    @Test
    @DisplayName("totalNamed with zero values returns 0")
    void totalNamed_emptyVarargs() {
        assertThat(processor.totalNamed("Empty")).isEqualTo(0);
    }

}

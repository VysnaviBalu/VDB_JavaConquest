package org.example.encapsulation;

import org.example.encapsulation.enterprise.AppForm;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.assertj.core.api.Assertions.*;

@DisplayName("AppForm")
public class AppFormTest {

    @Test
    @DisplayName("Inputs valid name and rollNo")
    void inputsWithValidSucceeds(){
        AppForm appForm = new AppForm.Builder()
                .name("Vysh")
                .rollNo(12)
                .build();
        assertThat(appForm.getName()).isEqualTo("Vysh");
        assertThat(appForm.getRollNo()).isEqualTo(12);
    }

    @Test
    @DisplayName("Inputs name with spaces")
    void inputnNameWithSpaces(){
        AppForm appForm = new AppForm.Builder()
                .name("   vysh   ")
                .build();
        assertThat(appForm.getName()).isEqualTo("vysh");
    }

    @Test
    @DisplayName("Input name is null")
    void inputNameNull_NullPointerException(){
        assertThatThrownBy(()-> new AppForm.Builder()
                .name(null))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Name cannot be empty!");
    }

    @Test
    @DisplayName("Input with 0 rollNo")
    void inputRollNoWithZero_IllegalException(){
        assertThatThrownBy(()-> new AppForm.Builder().rollNo(0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Roll Number must be positive!");
    }


    @Test
    @DisplayName("Input with Negative rollNo")
    void inputRollNoWithNegative_IllegalException(){
        assertThatThrownBy(()-> new AppForm.Builder().rollNo(-32))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Roll Number must be positive!");
    }

    @Test
    @DisplayName("toString to print inputs")
    void printValidInputs(){
        AppForm appForm = new AppForm.Builder()
                .name("Vysh")
                .rollNo(23)
                .build();
        assertThat(appForm.toString()).contains("Vysh").contains("23");
    }

    @Test
    @DisplayName("Inputs built in any order")
    void inputBuildInAnyOrder(){
        AppForm appForm = new AppForm.Builder()
                .rollNo(12)
                .name("Xena")
                .build();
        assertThat(appForm.getName()).contains("Xena");

    }

}

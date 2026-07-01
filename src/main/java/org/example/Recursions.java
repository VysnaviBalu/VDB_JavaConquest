package org.example;
import java.util.Scanner;

public class Recursions {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        sc.close();
        printNat(n);

    }

    public static void printNat(int n){
        if(n==0) return;
        System.out.println(n);
        printNat(n-1);
    }
}

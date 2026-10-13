package org.example.inheritance.hierarchial.local;

import java.util.List;
import java.util.ArrayList;

public class inheritance {

    public static void main(String[] args){
        List<Father> family = new ArrayList<>();
        family.add(new Daughter());
        family.add(new Son());

        for(Father member: family){
            member.favFood();
            member.print();
            if(member instanceof Daughter d){
                System.out.println(d.gender);
                d.hobbies();;
            } else {System.out.println(member.gender);}
        }

    }
}

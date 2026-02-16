package com.example.pres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.metier.IMetier;

public class PresSpringAnnot {
   public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Res= "+metier.calcul());
    }
}

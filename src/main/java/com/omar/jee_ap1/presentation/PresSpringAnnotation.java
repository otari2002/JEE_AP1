package com.omar.jee_ap1.presentation;

import com.omar.jee_ap1.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.omar.jee_ap1.dao", "com.omar.jee_ap1.metier");
        IMetier metier = (IMetier) context.getBean(IMetier.class);
        System.out.println("Result : " + metier.calcul());
    }
}

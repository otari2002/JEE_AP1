package com.omar.jee_ap1.presentation;

import com.omar.jee_ap1.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringXML {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        IMetier metier = (IMetier) context.getBean("metier");
        System.out.println("Result : " + metier.calcul());
    }
}


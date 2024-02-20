package com.omar.jee_ap1.presentation;

import com.omar.jee_ap1.dao.DaoImpl;
import com.omar.jee_ap1.metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
         DaoImpl dao = new DaoImpl();
         MetierImpl metier = new MetierImpl(dao);
         metier.setDao(dao);
         System.out.println("Resultat : " + metier.calcul());

    }
}

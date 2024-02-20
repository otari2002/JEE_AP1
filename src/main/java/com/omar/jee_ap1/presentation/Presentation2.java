package com.omar.jee_ap1.presentation;


import com.omar.jee_ap1.dao.IDao;
import com.omar.jee_ap1.metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("config.txt"));
            String daoClassName = scanner.nextLine();
            Class cDao = Class.forName(daoClassName);
            IDao dao = (IDao) cDao.getDeclaredConstructor().newInstance();
            String metierClassName = scanner.nextLine();
            Class cMetier = Class.forName(metierClassName);
            IMetier metier = (IMetier) cMetier.getDeclaredConstructor().newInstance();
            Method method = cMetier.getMethod("setDao", IDao.class);
            method.invoke(metier, dao);
            System.out.println("Resultat : " +metier.calcul());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

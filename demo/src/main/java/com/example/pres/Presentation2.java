package com.example.pres;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;
import com.example.dao.IDao;
import com.example.metier.IMetier;

public class Presentation2 {
   /*public static void main(String[] args) throws IOException,ClassNotFoundException,InstantiationException,IllegalAccessException,NoSuchMethodException,InvocationTargetException{
        Scanner scanner=new Scanner(new File("config.txt"));

        String daoClassName=scanner.nextLine();
        Class<?> cdao=Class.forName(daoClassName);
        IDao dao=(IDao)cdao.getConstructor().newInstance();

        String metierClassName=scanner.nextLine();
        Class<?> cmetier=Class.forName(metierClassName);
        IMetier metier=(IMetier)cmetier.getConstructor(IDao.class).newInstance(dao);

        System.out.println("Res= "+metier.calcul());
        scanner.close();
    }*/
}

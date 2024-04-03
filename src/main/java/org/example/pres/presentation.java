package org.example.pres;

import org.example.dao.DaoImpl;
import org.example.ext.DaoImpl2;
import org.example.metier.MetierImpl;

public class presentation {
    public static void main(String[] args) {
        DaoImpl2 dao=new DaoImpl2() ;
        MetierImpl metier=new MetierImpl();
        metier.setDao(dao);
        System.out.println("Resultat="+metier.calcul());
    }
}


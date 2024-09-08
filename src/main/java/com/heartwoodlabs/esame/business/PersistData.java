package com.heartwoodlabs.esame.business;

import com.heartwoodlabs.esame.dao.BaseDao;
import com.heartwoodlabs.esame.dao.MarcaDao;
import com.heartwoodlabs.esame.dao.ProdottoDao;
import com.heartwoodlabs.esame.model.Marca;
import com.heartwoodlabs.esame.model.Prodotto;

import java.math.BigDecimal;

public class PersistData {




    public static void main(String[] args) throws Exception {
        BaseDao.initFactory("DefaultPersistenceUnit");

        MarcaDao marcaDao = new MarcaDao();
        Marca m1 = new Marca("Necchi");
        marcaDao.save(m1);
        System.out.println(m1);

        marcaDao = new MarcaDao();
        Marca m2 = new Marca("Philips");
        marcaDao.save(m2);
        System.out.println(m2);

        marcaDao = new MarcaDao();
        Marca m3 = new Marca("Bosch");
        marcaDao.save(m3);
        System.out.println(m3);

        marcaDao = new MarcaDao();
        Marca m4 = new Marca("Beko");
        marcaDao.save(m4);
        System.out.println(m4);

        marcaDao = new MarcaDao();
        Marca m5 = new Marca("Inno-hit");
        marcaDao.save(m5);
        System.out.println(m5);




        ProdottoDao prodottoDao = new ProdottoDao();
        Prodotto p1 = new Prodotto("macchina da cucire", "industriale", BigDecimal.valueOf(199.99), m1);
        prodottoDao.save(p1);
        System.out.println(p1);

        prodottoDao = new ProdottoDao();
        Prodotto p2  = new Prodotto("rasoio", "barba", BigDecimal.valueOf(69.99), m2);
        prodottoDao.save(p2);
        System.out.println(p2);

        prodottoDao = new ProdottoDao();
        Prodotto p3  = new Prodotto("frigorifero", "doppia porta", BigDecimal.valueOf(249.99), m3);
        prodottoDao.save(p3);
        System.out.println(p3);

        prodottoDao = new ProdottoDao();
        Prodotto p4  = new Prodotto("frigorifero", "combinato", BigDecimal.valueOf(369.99), m3);
        prodottoDao.save(p4);
        System.out.println(p4);

        prodottoDao = new ProdottoDao();
        Prodotto p5  = new Prodotto("frigorifero", "no frost", BigDecimal.valueOf(149.99), m4);
        prodottoDao.save(p5);
        System.out.println(p5);

        prodottoDao = new ProdottoDao();
        Prodotto p6  = new Prodotto("scopa elettrica", "600 W", BigDecimal.valueOf(39.99), m1);
        prodottoDao.save(p6);
        System.out.println(p6);

        prodottoDao = new ProdottoDao();
        Prodotto p7  = new Prodotto("radio-sveglia", "radio + mp3 player", BigDecimal.valueOf(19.99), m5);
        prodottoDao.save(p7);
        System.out.println(p7);

        prodottoDao = new ProdottoDao();
        Prodotto p8  = new Prodotto("radio-sveglia", "radio", BigDecimal.valueOf(14.99), m2);
        prodottoDao.save(p8);
        System.out.println(p8);

        prodottoDao = new ProdottoDao();
        Prodotto p9  = new Prodotto("radio", "am-fm", BigDecimal.valueOf(9.99), m2);
        prodottoDao.save(p9);
        System.out.println(p9);

        prodottoDao = new ProdottoDao();
        Prodotto p10  = new Prodotto("asciugacapelli", "500 W", BigDecimal.valueOf(29.99), m1);
        prodottoDao.save(p10);
        System.out.println(p10);


        BaseDao.shutdownFactory();
    }
}
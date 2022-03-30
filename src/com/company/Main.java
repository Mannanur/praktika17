package com.company;

public class Main {

    public static void main(String[] args) {
        Prodoves prodoves = new Prodoves(1,"Bektur", 32);
        Prodoves prodoves1 = new Prodoves(2,"Alinur", 35);
        Taksist taksist = new Taksist(3,"Altyn", 36);
        VoditelAvtobusa voditelAvtobusa = new VoditelAvtobusa(4, "Arslan", 40);


        Avtobus avtobus = new Avtobus(1,2005,"Black", "A 3214 B",
                new Prodoves[]{prodoves, prodoves1},voditelAvtobusa);

        Troleibus troleibus =new Troleibus(2,2008,"Blue", "B 4521 C", new Prodoves[]{prodoves,prodoves1});
        Mashina mashina = new Mashina(3,2012, "Seryi", "A 3654 S",
                taksist, voditelAvtobusa);

        System.out.println(avtobus);
        System.out.println(troleibus);
        System.out.println(mashina);



    }
}

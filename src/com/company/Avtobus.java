package com.company;

import java.util.Arrays;

public class Avtobus extends Trancport{
    Prodoves[] prodoves;
    VoditelAvtobusa voditelAvtobusa;
    public Avtobus(int id, int godVypuska, String color, String number, Prodoves[] prodoves, VoditelAvtobusa voditelAvtobusa) {
        super(id, godVypuska, color, number);
        this.prodoves=prodoves;
        this.voditelAvtobusa=voditelAvtobusa;

    }

    public Prodoves[] getProdoves() {
        return prodoves;
    }

    public void setProdoves(Prodoves[] prodoves) {
        this.prodoves = prodoves;
    }

    @Override
    public void jurot() {
        System.out.println(" Avtobus jurot");
    }

    @Override
    public void toktoit() {
        System.out.println(" Avtobus toktoit");
    }

    @Override
    public String toString() {
        return "Avtobus{ id-" +getId()+" chykkan jyly-"+getGodVypuska()+" sveti-"+getColor()+" nomeri-"+getNumber()+
                "\n"+ Arrays.toString(prodoves) +
                ", \n"+ voditelAvtobusa +'}';
    }
}

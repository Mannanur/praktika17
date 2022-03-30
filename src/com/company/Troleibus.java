package com.company;

import java.util.Arrays;

public class Troleibus extends Trancport{
    Prodoves [] prodoves;
    public Troleibus(int id, int godVypuska, String color, String number, Prodoves[]prodoves) {
        super(id, godVypuska, color, number);
        this.prodoves=prodoves;
    }

    @Override
    public void jurot() {
        System.out.println(" Troleibus jurot");
    }

    @Override
    public void toktoit() {
        System.out.println(" Troleibus toktoit");
    }

    @Override
    public String toString() {
        return "Troleibus{id-" +getId()+" chykkan jyly-"+getGodVypuska()+" sveti-"+getColor()+" nomeri-"+getNumber()+
                "\n"+ Arrays.toString(prodoves) +
                '}';
    }
}

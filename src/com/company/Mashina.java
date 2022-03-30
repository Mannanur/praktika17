package com.company;

public class Mashina extends Trancport{
    Taksist taksist;
    VoditelAvtobusa voditelAvtobusa;
    public Mashina(int id, int godVypuska, String color, String number, Taksist taksist, VoditelAvtobusa voditelAvtobusa) {
        super(id, godVypuska, color, number);
        this.taksist=taksist;
        this.voditelAvtobusa=voditelAvtobusa;
    }

    @Override
    public void jurot() {
        System.out.println(" Mashina jurot");
    }

    @Override
    public void toktoit() {
        System.out.println(" Mashina toktoit");
    }

    @Override
    public String toString() {
        return "Mashina{" +getId()+" chykkan jyly-"+getGodVypuska()+" sveti-"+getColor()+" nomeri-"+getNumber()+
                "\n"+ taksist +
                ",\n"+ voditelAvtobusa +
                '}';
    }
}

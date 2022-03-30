package com.company;

public abstract class Trancport {
    private int id;
    private int godVypuska;
    private String color;
    private String number;

    public Trancport(int id, int godVypuska, String color, String number) {
        this.id = id;
        this.godVypuska = godVypuska;
        this.color = color;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGodVypuska() {
        return godVypuska;
    }

    public void setGodVypuska(int godVypuska) {
        this.godVypuska = godVypuska;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public abstract void jurot();
    public abstract void toktoit();
}

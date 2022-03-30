package com.company;

public class Prodoves extends Person{
    public Prodoves(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String toString() {
        return "Prodoves{ id-" + getId()+" aty-" + getName()+" jashy-" +getAge()+" }";
    }
}

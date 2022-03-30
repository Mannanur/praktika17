package com.company;

public class Taksist extends Person{
    public Taksist(int id, String name, int age) {
        super(id, name, age);
    }
    @Override
    public String toString() {
        return "Taksist { id-" + getId()+" aty-" + getName()+" jashy-" +getAge()+" }";
    }
}

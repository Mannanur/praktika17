package com.company;

public class VoditelAvtobusa extends Person{
    public VoditelAvtobusa(int id, String name, int age) {

        super(id, name, age);
    }
    @Override
    public String toString() {
        return "Voditel avtobusa { id-" + getId()+" aty-" + getName()+" jashy-" +getAge()+" }";
    }
}

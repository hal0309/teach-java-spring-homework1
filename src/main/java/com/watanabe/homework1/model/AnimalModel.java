package com.watanabe.homework1.model;

public class AnimalModel {
    public String name;
    public String type;
    public AnimalModel(String name, String type){
        this.name = name;
        this.type = type;
    }


    public void hello() {
        System.out.println("animal yeah!");
    }
}

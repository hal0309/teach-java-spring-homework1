package com.watanabe.homework1.model;

public class DogModel extends AnimalModel {
    public DogModel(String name){
        super(name, "dog");
    }

    // hello()をオーバーライドして、犬の鳴き声を出力
    @Override
    public void hello() {
        System.out.println("dog bow!!");
    }
}

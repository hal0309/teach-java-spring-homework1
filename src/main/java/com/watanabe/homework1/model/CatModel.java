package com.watanabe.homework1.model;

public class CatModel extends AnimalModel {
    public CatModel(String name){
        super(name, "cat");
    }

    // hello()をオーバーライドして、猫の鳴き声を出力
    @Override
    public void hello() {
        System.out.println("cat meow!!");
    }

}

package com.watanabe.homework1.model;

public class HumanModel extends AnimalModel {
    public HumanModel(String name){
        super(name, "human");
    }

    // hello()をオーバーライドして、人間ののあいさつを出力
    // hello()をオーバーライドして、犬の鳴き声を出力
    @Override
    public void hello() {
        System.out.println("human hello!!");
    }

}

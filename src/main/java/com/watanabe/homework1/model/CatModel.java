package com.watanabe.homework1.model;

public class CatModel extends AnimalModel {
    public CatModel(String name){
        super(name, "cat");
    }

    // todo: hello()をオーバーライドして、猫の鳴き声を出力するようにしてください。
    @Override
    public void hello(){
        System.out.println("nyah"); // 処理を変更
    }
}

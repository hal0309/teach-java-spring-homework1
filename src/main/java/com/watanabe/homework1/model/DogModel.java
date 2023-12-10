package com.watanabe.homework1.model;

public class DogModel extends AnimalModel {
    public DogModel(String name){
        super(name, "dog");
    }

    // todo: hello()をオーバーライドして、犬の鳴き声を出力するようにしてください。
    @Override
    public void hello(){
        System.out.println("one"); // 処理を変更
    }
}

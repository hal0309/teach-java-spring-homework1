package com.watanabe.homework1.model;

public class HumanModel extends AnimalModel {
    public HumanModel(String name){
        super(name, "human");
    }

    // todo: hello()をオーバーライドして、人間ののあいさつを出力するようにしてください。
    @Override
    public void hello(){
        System.out.println("hello"); // 処理を変更
    }
}

package com.watanabe.homework1.controller;

import com.watanabe.homework1.model.AnimalModel;
import com.watanabe.homework1.model.CatModel;
import com.watanabe.homework1.model.DogModel;
import com.watanabe.homework1.model.HumanModel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("list")
public class ListController {
    /* 各種リストを定義 */
    List<HumanModel> humanList = new ArrayList<>();
    List<DogModel> dogList = new ArrayList<>();
    List<CatModel> catList = new ArrayList<>();
    List<AnimalModel> animalList = new ArrayList<>();

    @PostMapping("addAnimal")
    public AnimalModel postAnimal(@RequestBody AnimalModel animalModel){
        /* typeパラメータを基にモデルを分岐して追加 */
        switch (animalModel.type){
            case "human": humanList.add(new HumanModel(animalModel.name)); break;
            case "dog": dogList.add(new DogModel(animalModel.name)); break;
            case "cat": catList.add(new CatModel(animalModel.name)); break;
            default: animalList.add(animalModel); break;
        }

        /* 画面表示(テスト用) */
        System.out.println("humanList: " + humanList.stream().map(x -> x.name).toList());
        System.out.println("dogList: " + dogList.stream().map(x -> x.name).toList());
        System.out.println("catList: " + catList.stream().map(x -> x.name).toList());
        System.out.println("animalList: " + animalList.stream().map(x -> x.name).toList());

        return animalModel;
    }

    /* 各種のgetエンドポイントを実装 */
    @GetMapping("getHumanList")
    public List<HumanModel> getHumanList(){
        return humanList;
    }

    @GetMapping("getDogList")
    public List<DogModel> getDogList(){
        return dogList;
    }

    @GetMapping("getCatList")
    public List<CatModel> getCatList(){
        return catList;
    }

    @GetMapping("getAnimalList")
    public List<AnimalModel> getAnimalList(){
        return animalList;
    }
}

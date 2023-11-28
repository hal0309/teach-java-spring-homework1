package com.watanabe.homework1.controller;

import com.watanabe.homework1.model.AnimalModel;
import com.watanabe.homework1.model.CatModel;
import com.watanabe.homework1.model.DogModel;
import com.watanabe.homework1.model.HumanModel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("list")
public class ListController {
    List<AnimalModel> animalList = new ArrayList<>();
    Map<String, AnimalModel> animalMap = new HashMap<>();

    @PostMapping("addAnimal")
    public AnimalModel postAnimal(@RequestBody AnimalModel animalModel){
        // 受け取ったAnimalModelのtypeによって、サブクラスに変換する
        AnimalModel typedAnimalModel = switch (animalModel.type) {
            case "human" -> new HumanModel(animalModel.name);
            case "dog" -> new DogModel(animalModel.name);
            case "cat" -> new CatModel(animalModel.name);
            default -> animalModel;
        };

        // animalListに追加
        animalList.add(typedAnimalModel);

        // animalMapに追加
        addAnimalToMap(typedAnimalModel);

        // todo: この画面表示が適切になるように考える
        System.out.println("animalList: " + animalList.toString());

        return animalModel;
    }

    private void addAnimalToMap(AnimalModel animalModel) {
        /* AnimalModelをtypeによって分類し、追加or更新する */
        switch (animalModel.type){
            case "human": animalMap.put("human", animalModel); break;
            case "dog": animalMap.put("dog", animalModel); break;
            case "cat": animalMap.put("cat", animalModel); break;
            default: animalMap.put("animal", animalModel); break;
        }

        // todo: この画面表示が適切になるように考える
        System.out.println("animalMap: " + animalMap);
    }


    @GetMapping("getAnimalList")
    public List<AnimalModel> getAnimalList(){
        return animalList;
    }
}

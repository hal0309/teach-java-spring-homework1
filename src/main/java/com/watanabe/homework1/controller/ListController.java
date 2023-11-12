package com.watanabe.homework1.controller;

import com.watanabe.homework1.model.AnimalModel;
import com.watanabe.homework1.model.CatModel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("list")
public class ListController {
    /* todo: humanList, dogList, catList, animalListを定義 */

    List<CatModel> catList = new ArrayList<>();

    @PostMapping("addAnimal")
    public AnimalModel postAnimal(@RequestBody AnimalModel animalModel){
        /* todo: 何れかのリストにmodelを追加 */
        return animalModel;
    }

    /* todo: getHumanList, getDogList, getCatList, getAnimalList を実装 */
}

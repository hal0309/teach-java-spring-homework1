package com.watanabe.homework1;

import com.watanabe.homework1.model.AnimalModel;
import com.watanabe.homework1.model.CatModel;
import com.watanabe.homework1.model.DogModel;
import com.watanabe.homework1.model.HumanModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

@SpringBootApplication
public class Homework1Application {

	public static void main(String[] args) {
		SpringApplication.run(Homework1Application.class, args);


		Scanner scanner = new Scanner(System.in);
		String input;

		List<HumanModel> humanList = new ArrayList<>();
		List<DogModel> dogList = new ArrayList<>();
		List<CatModel> catList = new ArrayList<>();
		List<AnimalModel> animalList = new ArrayList<>();

		List<String> stringList = new ArrayList<>();
		List<Integer> integerList = new ArrayList<>();


		do {
			System.out.println("\n---Please input a type---");
			String type = scanner.nextLine();
			System.out.println("---Please input a name---");
			String name = scanner.nextLine();
			System.out.println("type: " + type + ", name: " + name);


			switch (type){
				case "human": humanList.add(new HumanModel(name)); break;
				case "dog": dogList.add(new DogModel(name)); break;
				case "cat": catList.add(new CatModel(name)); break;
				default: animalList.add(new AnimalModel(name, type)); break;
			}


			System.out.println("humanList: " + humanList.stream().map(x -> x.name).toList());
			System.out.println("dogList: " + dogList.stream().map(x -> x.name).toList());
			System.out.println("catList: " + catList.stream().map(x -> x.name).toList());
			System.out.println("animalList: " + animalList.stream().map(x -> x.name).toList());



		} while (true);

	}

}

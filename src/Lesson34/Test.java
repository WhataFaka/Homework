package Lesson34;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal(1));
        listOfAnimals.add(new Animal(2));

        List<Dog> listOfDog = new ArrayList<>();
        listOfDog.add(new Dog());
        listOfDog.add(new Dog());

        test(listOfAnimals);
        test(listOfDog);
    }

    private static void test(List<? extends Animal> list) {
        for (Animal animal: list) {
            System.out.println(animal);
            animal.eat();
        }
    }
}

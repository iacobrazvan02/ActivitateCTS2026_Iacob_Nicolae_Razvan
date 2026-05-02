package ro.ase.cts.zoo;

import ro.ase.cts.animale.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String name;
    private ZooKeeper keeper;
    private List<Animal> animals;

    public Zoo(String name, ZooKeeper keeper) {
        this.name = name;
        this.keeper = keeper;
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void feedAllAnimals(){
        for(Animal a : animals){
            keeper.feedAnimal(a);
        }
    }
}
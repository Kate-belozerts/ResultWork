package project.farm;

import project.animals.Animals;
import project.animals.home.Cat;
import project.animals.home.Dog;
import project.animals.home.Hamster;
import project.animals.pack.Camel;
import project.animals.pack.Donkey;
import project.animals.pack.Horse;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private List<Cat> catFarm;
    private List<Dog> dogFarm;
    private List<Hamster> hamsterFarm;
    private List<Camel> camelFarm;
    private List<Donkey> donkeyFarm;
    private List<Horse> horseFarm;

    {
        catFarm = new ArrayList<Cat>();
        dogFarm = new ArrayList<Dog>();
        hamsterFarm = new ArrayList<Hamster>();
        camelFarm = new ArrayList<Camel>();
        donkeyFarm = new ArrayList<Donkey>();
        horseFarm = new ArrayList<Horse>();
    }

    public void addToCatFarm(Cat cat) {
        this.catFarm.add(cat);
    }

    public void addToDogFarm(Dog dog) {
        this.dogFarm.add(dog);
    }

    public void addToHamsterFarm(Hamster hamster) {
        this.hamsterFarm.add(hamster);
    }

    public void addToCamelFarm(Camel camel) {
        this.camelFarm.add(camel);
    }

    public void addToDonkeyFarm(Donkey donkey) {
        this.donkeyFarm.add(donkey);
    }

    public void addToHorseFarm(Horse horse) {
        this.horseFarm.add(horse);
    }

    public Animals findAnimalByName(String name) {
        name = name.toLowerCase();
        for (Cat cat :
                catFarm) {
            if (cat.getName().equals(name)) return cat;
        }
        for (Dog dog :
                dogFarm) {
            if (dog.getName().equals(name)) return dog;
        }
        for (Hamster hamster :
                hamsterFarm) {
            if(hamster.getName().equals(name)) return hamster;
        }
        for (Camel camel :
                camelFarm) {
            if (camel.getName().equals(name)) return camel;
        }
        for (Donkey donkey :
                donkeyFarm) {
            if (donkey.getName().equals(name)) return donkey;
        }
        for (Horse horse :
                horseFarm) {
            if (horse.getName().equals(name)) return horse;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Farm: " +
                "cats - " + catFarm + '\n' +
                ", dogs - " + dogFarm + '\n' +
                ", hamsters - " + hamsterFarm + '\n' +
                ", camels - " + camelFarm + '\n' +
                ", donkeys - " + donkeyFarm + '\n' +
                ", horses - " + horseFarm + '\n';
    }
}

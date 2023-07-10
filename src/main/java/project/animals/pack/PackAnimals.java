package project.animals.pack;

import project.animals.Animals;

public class PackAnimals extends Animals {
    private final String TYPE = "pack";
    public PackAnimals(int age, String name) {
        super(age, name);
    }

    @Override
    public String toString() {
        return "This animal: " +
                "Type - " + TYPE +
                ", age - " + age +
                ", name - " + name;
    }
}

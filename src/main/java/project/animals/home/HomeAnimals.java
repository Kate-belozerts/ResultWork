package project.animals.home;

import project.animals.Animals;

public class HomeAnimals extends Animals {
    private final String TYPE = "pet";
    public HomeAnimals(int age, String name) {
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

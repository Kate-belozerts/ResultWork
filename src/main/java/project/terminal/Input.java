package project.terminal;

import project.Counter;
import project.animals.Animals;
import project.animals.home.Cat;
import project.animals.home.Dog;
import project.animals.home.Hamster;
import project.animals.pack.Camel;
import project.animals.pack.Donkey;
import project.animals.pack.Horse;
import project.farm.Farm;
import project.menu.Menu;

import java.util.Scanner;

public class Input {
    private Farm farm;
    private Counter counter;

    public void start() {
        this.farm = new Farm();
        this.counter = new Counter();

        while (true) {
            Menu.printMenu();
            int number = new Scanner(System.in).nextInt();

            switch (number) {
                case 1 -> {
                    return;
                }
                case 2 -> addAnimal();
                case 3 -> allCommands();
                case 4 -> addCommand();
                case 5 -> showAll();
            }
        }
    }

    public void addAnimal() {
        Menu.add();
        int number = new Scanner(System.in).nextInt();
        String[] res;

        try {
            res = parameters();
            if (res.length == 2 && res[0].matches("\\d+")) {
                counter.add();
                switch (number) {
                    case 1 -> farm.addToDogFarm(new Dog(Integer.parseInt(res[0]), res[1]));
                    case 2 -> farm.addToCatFarm(new Cat(Integer.parseInt(res[0]), res[1]));
                    case 3 -> farm.addToHamsterFarm(new Hamster(Integer.parseInt(res[0]), res[1]));
                    case 4 -> farm.addToCamelFarm(new Camel(Integer.parseInt(res[0]), res[1]));
                    case 5 -> farm.addToHorseFarm(new Horse(Integer.parseInt(res[0]), res[1]));
                    case 6 -> farm.addToDonkeyFarm(new Donkey(Integer.parseInt(res[0]), res[1]));
                }
            }
        } catch (Exception e) {
            System.out.println("Неправильно введены параметры");
        }

    }

    private String[] parameters() {
        System.out.println("Возраст: ");
        int age = new Scanner(System.in).nextInt();
        System.out.println("Кличка: ");
        String name = new Scanner(System.in).nextLine();
        return new String[]{String.valueOf(age), name};
    }

    private String getAnimalName() {
        System.out.println("Введите имя животного: ");
        return new Scanner(System.in).nextLine().toLowerCase();
    }

    public void allCommands() {
        String name = getAnimalName();
        if (name.length()>0){
            Animals pet = this.farm.findAnimalByName(name);
            if (pet != null) System.out.println(pet.getCommands());
            else System.out.println("Такого животного нет");
        }
    }

    public void addCommand() {
        String name = getAnimalName();
        System.out.println("Введите команду, которую хотите добавить");
        String command = new Scanner(System.in).nextLine();
        if (name.length()>0){
            Animals pet = this.farm.findAnimalByName(name);
            if (pet != null && command.length() > 0) pet.setCommands(command);
            else System.out.println("Такого животного нет");
        }
    }

    public void showAll() {
        System.out.println(farm.toString());
        System.out.println(counter + "\n");
    }
}


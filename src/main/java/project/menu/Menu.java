package project.menu;

public class Menu {
    public static void printMenu(){
        System.out.println("""
                1 - выйти\s
                2 - добавить животное\s
                3 - список команд животного по имени\s
                4 - добавить команду по имени\s
                5 - показать весь питомник""");
    }

    public static void add(){
        System.out.println("""
                Какое животное хотите добавить?\s
                1 - собаку\s
                2 - кошку\s
                3 - хомяка\s
                4 - верблюда\s
                5 - лошадь\s
                6 - осла\s
                """);
    }
}

package project.animals;

public abstract class Animals {
    protected int age;
    protected String name;
    protected String commands = "eat";


    public Animals(int age, String name) {
        this.age = age;
        this.name = name.toLowerCase();
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = this.commands + ", " + commands;
    }

    public String getName() {
        return name;
    }
}

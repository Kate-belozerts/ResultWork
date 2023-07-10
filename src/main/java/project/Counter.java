package project;

public class Counter {
    private int counter = 0;

    public void add(){
        this.counter += 1;
    }

    @Override
    public String toString() {
        return "Count of addition: " + counter;
    }
}

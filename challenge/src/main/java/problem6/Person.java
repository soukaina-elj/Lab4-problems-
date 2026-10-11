package problem6;

public abstract class Person {
    private String name;
    public Person(String name) {
            this.name = name;
    }
    public abstract void display();
    public String getName() {
        return name;
    }
}

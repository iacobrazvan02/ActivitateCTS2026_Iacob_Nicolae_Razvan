package ro.ase.cts.animale;

public abstract class Animal {
    protected String name;
    protected String food;
    protected int age;
    public abstract void eat(String nume);

    public Animal(String name, String food, int age) {
        this.name = name;
        this.age = age;
        this.food = food;
    }
}
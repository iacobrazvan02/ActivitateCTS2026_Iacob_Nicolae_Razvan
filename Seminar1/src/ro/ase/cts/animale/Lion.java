package ro.ase.cts.animale;

public class Lion extends Animal{
    private float greutate;

    public Lion(String name, int age, String food, float greutate) {
        super(name, food, age);
        this.greutate = greutate;
    }

    @Override
    public void eat(String numeZookeper) {
        System.out.println("Zookeeperul " + numeZookeper + " hraneste leul " + this.name + " cu " + super.food);
    }
}
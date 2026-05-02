package ro.ase.cts.animale;

public class Zebra extends Animal{
    private int nrDungi;

    @Override
    public void eat(String numeZookeper) {
        System.out.println("Zookeeperul " + numeZookeper + " hraneste Zebra " + this.name + " cu " + super.food);
    }

    public Zebra(String name, int age, String food, int nrDungi) {
        super(name, food, age);
        this.nrDungi = nrDungi;
    }
}
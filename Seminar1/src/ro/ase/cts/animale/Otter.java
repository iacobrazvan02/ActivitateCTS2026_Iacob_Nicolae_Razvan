package ro.ase.cts.animale;

public class Otter extends Animal{
    private String tipMediu;
    @Override
    public void eat(String numeZookeper) {
        System.out.println("Zookeeperul " + numeZookeper + " a hranit vidra " + super.name + " cu " + super.food);
    }

    public Otter(String name, int age, String food, String tipMediu) {
        super(name, food, age);
        this.tipMediu = tipMediu;
    }
}
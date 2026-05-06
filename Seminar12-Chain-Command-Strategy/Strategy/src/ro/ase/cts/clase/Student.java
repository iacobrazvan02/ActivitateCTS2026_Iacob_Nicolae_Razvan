package ro.ase.cts.clase;

public class Student {
    private String name;
    private ModSustinere modSustinere;

    public Student(String name, ModSustinere modSustinere) {
        this.name = name;
        this.modSustinere = modSustinere;

    }

    public Student(String name) {
        this.modSustinere = new Grila();
        this.name = name;
    }

    public void setModSustinere(ModSustinere modSustinere) {
        this.modSustinere = modSustinere;
    }

    public void examinare(){
        modSustinere.sustinereExamen();
    }
}

package mendoza.brayan.pp.progii121.models;

public class Ave extends Animal implements Vacunable {

    private double envergaduraAlas;

    public Ave(String nombre, int edad, double envergaduraAlas) {
        super(nombre, edad);
        this.envergaduraAlas = envergaduraAlas;
    }

    @Override
    public String toString() {
        return "Ave [" + " Envergadura de Alas: " + envergaduraAlas + ']';
    }

    @Override
    public boolean vacunar() {
        return true;
    }

}

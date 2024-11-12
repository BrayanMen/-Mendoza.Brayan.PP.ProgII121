package mendoza.brayan.pp.progii121.models;

import mendoza.brayan.pp.progii121.enums.Dieta;

public class Mamifero extends Animal implements Vacunable {

    private double peso;
    private Dieta dieta;

    public Mamifero(String nombre, int edad, double peso, Dieta dieta) {
        super(nombre, edad);
        this.peso = peso;
        this.dieta = dieta;
    }

    @Override
    public String toString() {
        return "Mamifero ["
                + " peso: " + peso + ", dieta: " + dieta + ']';
    }

    @Override
    public boolean vacunar() {
        return true;
    }
}

package mendoza.brayan.pp.progii121.models;

import mendoza.brayan.pp.progii121.enums.Dieta;

public class Mamifero extends Animal {

    public Mamifero(String nombre, int edad, double peso, Dieta dieta) {
        super(nombre, edad, peso, dieta);
    }

    @Override
    public String toString() {
        return "Mamifero ["
                + " peso=" + getPeso()
                + ", dieta=" + getDieta()
                + ']';
    }

    @Override
    public boolean vacunar() {
        return true;
    }

}

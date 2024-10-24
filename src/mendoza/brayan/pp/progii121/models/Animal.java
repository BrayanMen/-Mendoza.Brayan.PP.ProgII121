package mendoza.brayan.pp.progii121.models;

import mendoza.brayan.pp.progii121.enums.Dieta;

public abstract class Animal {

    private String nombre;
    private int edad;
    private double peso;
    private Dieta dieta;

    public Animal(String nombre, int edad, double peso, Dieta dieta) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.dieta = dieta;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public Dieta getDieta() {
        return dieta;
    }

    @Override
    public String toString() {
        return "Animal[" + "nombre=" + getNombre() + ", edad=" + getEdad() + ", peso=" + getPeso() + ", dieta=" + getDieta() + ']';
    }

    public abstract boolean vacunar();

}

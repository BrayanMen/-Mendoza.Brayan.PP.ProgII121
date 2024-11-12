package mendoza.brayan.pp.progii121.models;

public class Reptil extends Animal {

    private String tipoEscama;
    private String regTermica;

    public Reptil(String nombre, int edad, String tipoEscama, String regTermica) {
        super(nombre, edad);
        this.tipoEscama = tipoEscama;
        this.regTermica = regTermica;
    }

    @Override
    public String toString() {
        return "Reptil[" + "tipoEscama= " + tipoEscama + ", regTermica= " + regTermica + ']';
    }

}

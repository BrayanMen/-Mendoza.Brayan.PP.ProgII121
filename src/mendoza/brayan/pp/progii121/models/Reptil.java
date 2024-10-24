package mendoza.brayan.pp.progii121.models;

import mendoza.brayan.pp.progii121.enums.Dieta;

public class Reptil extends Animal {

    private String tipoEscama;
    private String regTermica;

    public Reptil(String nombre, int edad, double peso, Dieta dieta, String tipoEscama, String regTermica) {
        super(nombre, edad, peso, dieta);
        this.tipoEscama = tipoEscama;
        this.regTermica = regTermica;
    }

    private String getTipoEscama() {
        return tipoEscama;
    }

    private String getRegTermica() {
        return regTermica;
    }

    @Override
    public boolean vacunar() {
        return false;
    }

    @Override
    public String toString() {
        return "Reptil[" + "tipoEscama=" + getTipoEscama() + ", regTermica=" + getRegTermica() + ']';
    }

}

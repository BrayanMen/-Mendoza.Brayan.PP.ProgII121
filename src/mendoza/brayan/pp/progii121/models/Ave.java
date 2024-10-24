package mendoza.brayan.pp.progii121.models;

import mendoza.brayan.pp.progii121.enums.Dieta;

public class Ave extends Animal {

    private double envergaduraAlas;

    public Ave(String nombre, int edad, double peso, Dieta dieta, double envergaduraAlas) {
        super(nombre, edad, peso, dieta);
        this.envergaduraAlas = envergaduraAlas;
    }

    private double getEnvergaduraAlas() {
        return envergaduraAlas;
    }

    @Override
    public boolean vacunar() {
         return true;
    }
    
    @Override
    public String toString() {
        return "Ave ["
                + " Envergadura de Alas=" + getEnvergaduraAlas()
                + ']';
    }

}

package mendoza.brayan.pp.progii121.models;

import java.util.ArrayList;
import java.util.List;
import mendoza.brayan.pp.progii121.exception.ExceptionAnimalDuplicado;
import mendoza.brayan.pp.progii121.exception.ExceptionAnimalesEmpty;
import mendoza.brayan.pp.progii121.exception.ExceptionAnimalesVacuna;

public class Zoologico {

    private List<Animal> animales;

    public Zoologico() {
        animales = new ArrayList<>();
    }

    public void agregarAnimales(Animal animal) {
        for (Animal a : animales) {
            if (a.getNombre().equals(animal.getNombre()) && a.getEdad() == animal.getEdad()) {
                throw new ExceptionAnimalDuplicado();
            }
        }
        animales.add(animal);
    }

    public void mostrarAnimales() throws ExceptionAnimalesEmpty {
        if (animales.isEmpty()) {
            throw new ExceptionAnimalesEmpty();
            }
            for (Animal a : animales) {
                System.out.println(a);
                System.out.println("");
        }
    }

    public void vacunarAnimales() {
        for (Animal a : animales) {
            boolean vacunar = a.vacunar();
            if (!vacunar) {
                throw new ExceptionAnimalesVacuna("No se puede vacunar este animal: " + a.getNombre());
            }
        }
    }
}

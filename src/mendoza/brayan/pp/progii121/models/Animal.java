package mendoza.brayan.pp.progii121.models;
import java.util.Objects;

public abstract class Animal {

    private String nombre;
    private double edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Animal a = (Animal) o;
        return nombre.equals(a.nombre) && edad == a.edad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad);
    }
    
    

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Animal[" + "nombre=" + getNombre() + ", edad=" + edad + ']';
    }

}

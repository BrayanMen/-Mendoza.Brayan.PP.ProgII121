package mendoza.brayan.pp.progii121;
import mendoza.brayan.pp.progii121.enums.Dieta;
import mendoza.brayan.pp.progii121.exception.ExceptionAnimalDuplicado;
import mendoza.brayan.pp.progii121.exception.ExceptionAnimalesEmpty;
import mendoza.brayan.pp.progii121.models.Animal;
import mendoza.brayan.pp.progii121.models.Ave;
import mendoza.brayan.pp.progii121.models.Mamifero;
import mendoza.brayan.pp.progii121.models.Reptil;
import mendoza.brayan.pp.progii121.models.Zoologico;

public class MendozaBrayanPPProgII121 {

    public static void main(String[] args) {
        // TODO code application logic here
        Zoologico zoo = new Zoologico();

        Animal m1 = new Mamifero("Leon", 5, 190.5, Dieta.CARNIVORO);
        Mamifero m2 = new Mamifero("Perro", 3, 15, Dieta.OMNIVORO);
        Animal m3 = new Mamifero("Raton", 1, 0.5, Dieta.OMNIVORO);
        Mamifero m4 = new Mamifero("Jirafa", 8, 90.5, Dieta.HERBIVORO);
        Animal m5 = new Mamifero("Venado", 10, 160.5, Dieta.HERBIVORO);

        Animal a1 = new Ave("Aguila", 3, 2.1);
        Animal a2 = new Ave("Condor", 7, 2.2);
        Animal a3 = new Ave("Colibri", 1, 0.1);
        Animal a4 = new Ave("Paloma", 4, 0.4);
        Animal a5 = new Ave("Perico", 2, 0.3);

        Animal s1 = new Reptil("Serpiente", 2, "Escamas lisas", "Ectotermia");
        Animal s2 = new Reptil("Iguana", 6, "Escamas Laminares", "Endotermia");
        Animal s3 = new Reptil("Tortuga", 1, "Escamas lisas", "Heterotermia");
        Animal s4 = new Reptil("Camaleon", 3, "Escamas Granulares", "Ectotermia");
        Animal s5 = new Reptil("Serpiente", 2, "Escamas lisas", "Ectotermia");

        try {
            zoo.agregarAnimales(m1);
            zoo.agregarAnimales(m2);
            zoo.agregarAnimales(m3);
            zoo.agregarAnimales(m4);
            zoo.agregarAnimales(m5);
        } catch (ExceptionAnimalDuplicado e) {
            System.out.println("");
            System.out.println(e.getMessage());
            System.out.println("");
        }

        try {
            zoo.agregarAnimales(a1);
            zoo.agregarAnimales(a2);
            zoo.agregarAnimales(a3);
            zoo.agregarAnimales(a4);
            zoo.agregarAnimales(a5);
        } catch (ExceptionAnimalDuplicado e) {
            System.out.println("");
            System.out.println(e.getMessage());
            System.out.println("");
        }

        try {
            zoo.agregarAnimales(s1);
            zoo.agregarAnimales(s2);
            zoo.agregarAnimales(s3);
            zoo.agregarAnimales(s4);
            zoo.agregarAnimales(s5);
        } catch (ExceptionAnimalDuplicado e) {
            System.out.println("");
            System.out.println(e.getMessage());
            System.out.println("");
        }

        try {
            zoo.mostrarAnimales();
            zoo.vacunarAnimales();
        } catch (ExceptionAnimalesEmpty e) {
            System.out.println(e.getMessage());
        }

    }
}

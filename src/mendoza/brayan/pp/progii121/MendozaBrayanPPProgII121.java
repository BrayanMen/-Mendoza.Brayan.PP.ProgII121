package mendoza.brayan.pp.progii121;

import mendoza.brayan.pp.progii121.enums.Dieta;
import mendoza.brayan.pp.progii121.exception.ExceptionAnimalDuplicado;
import mendoza.brayan.pp.progii121.exception.ExceptionAnimalesEmpty;
import mendoza.brayan.pp.progii121.exception.ExceptionAnimalesVacuna;
import mendoza.brayan.pp.progii121.models.Animal;
import mendoza.brayan.pp.progii121.models.Ave;
import mendoza.brayan.pp.progii121.models.Mamifero;
import mendoza.brayan.pp.progii121.models.Reptil;
import mendoza.brayan.pp.progii121.models.Zoologico;

public class MendozaBrayanPPProgII121 {

    public static void main(String[] args) {
        // TODO code application logic here
        Zoologico zoo = new Zoologico();

        Animal leon = new Mamifero("León", 5, 190.5, Dieta.CARNIVORO);
        Animal aguila = new Ave("Águila", 3, 10.2, Dieta.CARNIVORO, 2.1);
        Animal serpiente = new Reptil("Serpiente", 2, 3.5, Dieta.CARNIVORO, "Escamas lisas", "Ectotermia");

        try {
            zoo.agregarAnimales(aguila);
            zoo.agregarAnimales(leon);
            zoo.agregarAnimales(serpiente);

            zoo.mostrarAnimales();
            zoo.agregarAnimales(serpiente);
            zoo.mostrarAnimales();

            zoo.vacunarAnimales();

        } catch (ExceptionAnimalDuplicado e) {
            System.out.println(e.getMessage());
        } catch (ExceptionAnimalesEmpty e) {
            System.out.println(e.getMessage());
        } catch (ExceptionAnimalesVacuna e) {
            System.out.println(e.getMessage());
        }

    }
}

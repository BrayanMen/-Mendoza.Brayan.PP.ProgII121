package mendoza.brayan.pp.progii121.exception;

public class ExceptionAnimalDuplicado extends RuntimeException{
    private static final String MESSAGE = "El animal ya existe.";
    public ExceptionAnimalDuplicado() {
        super(MESSAGE);
    }
    
    
}

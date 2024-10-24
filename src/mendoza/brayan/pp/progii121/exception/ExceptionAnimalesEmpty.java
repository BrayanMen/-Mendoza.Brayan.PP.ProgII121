package mendoza.brayan.pp.progii121.exception;

public class ExceptionAnimalesEmpty extends Exception {

    private static final String MESSAGE = "No hay animales.";

    public ExceptionAnimalesEmpty() {
        super(MESSAGE);
    }
}

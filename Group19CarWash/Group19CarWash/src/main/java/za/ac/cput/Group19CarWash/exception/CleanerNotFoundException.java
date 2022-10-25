package za.ac.cput.Group19CarWash.exception;

public class CleanerNotFoundException extends  RuntimeException{
    public CleanerNotFoundException(String message) {
        super(message);
    }
}

package exceptions;

public class ThrowAnException {
    public static void main(String[] args){
        RuntimeException exception = new RuntimeException("New exception!");
        throw exception;
    }
}

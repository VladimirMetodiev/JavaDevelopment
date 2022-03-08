package exceptions.newErrorClass;

public class MyException extends RuntimeException {
    private int code;

    MyException(int code) {
        super("MyException class error");
        this.code = code;
    }

    public String getMessage() {
        return super.getMessage() + "\nError code: " + code;
    }

    public String toString() {
        return "<MyException: " + code + ">";
    }
}

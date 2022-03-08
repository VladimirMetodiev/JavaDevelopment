package exceptions.newErrorClass;

public class Main {
    public static void main(String[] args) {
        try {
            throw new MyException(123);
        }
        catch (MyException ex){
            System.out.println(ex);
            System.out.println(ex.getMessage());
        }
    }
}

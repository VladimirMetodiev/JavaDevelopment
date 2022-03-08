package exceptions;

public class ThrowAnExceptionVarTwo {
    public static void main(String[] args) {
        try{
            try{
                NullPointerException ex1 = new NullPointerException();
                throw ex1;
            }
            catch (NullPointerException ex1){
                System.out.println("The first exception.");
            }

            NumberFormatException ex2 = new NumberFormatException("This isn't a numbers.");
            throw ex2;
        }
        catch (NumberFormatException ex2){
            System.out.println("The second exception.");
            System.out.println(ex2.getMessage());
        }
        finally {
            System.out.println("Game over!");
        }
    }
}

// Блокът finally се изпълнява винаги, независимо дали е прихванато изключение или не е прихванато. Той ще се изпълни, дори ако
// в try или catch блока е поставена инструкцията return.

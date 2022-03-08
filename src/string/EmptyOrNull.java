package string;

public class EmptyOrNull {
    public static void main(String[] args) {
        String str = null;
        parse(str);

        str = "";
        parse(str);

        str = "nine";
        parse(str);

        str = "9";
        parse(str);
    }

    private static void parse(String str) {
        try {
            if(str.isEmpty()) throw new IllegalArgumentException("empty string");
            double num = Double.parseDouble(str);
            System.out.println(num);
        }
        catch (NumberFormatException ex) {
            System.out.println("Exception: it is not a number");
        }
        catch (NullPointerException ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        catch (IllegalArgumentException ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }
}

package regularExpressions;

public class ReplaceSomething {
    public static void main(String[] args) {
        String str = "XML    is  a  markup    language  used   for    storing      and   transporting   data.";
        str = str.replaceAll("\\s{2,}", " ");
        System.out.println(str);



        str = "XML doesn't depend on the platform and the programming language. You can write a program in any language on any operating system to send, receive or store data using XML.";
        str = str.replaceAll("\\bp\\w+", "*****");
        System.out.println(str);
    }
}

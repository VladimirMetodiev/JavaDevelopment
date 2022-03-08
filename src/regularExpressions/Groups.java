package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Groups {
    public static void main(String[] args) {
        String cardNumbers = "74395365479561230524753;74395853479521210624111;74394991172875940724937;74396382273486481124526";
        String[] data = cardNumbers.split(";");

        Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher;

        for (int a = 0; a < data.length; a++) {
            matcher = pattern.matcher(data[a]);
            System.out.println(matcher.replaceAll( "$5/$6 $1 $2 $3 $4 ($7)"));
        }
    }
}



//Bank card number
//7439 5365 4795 6123 05/24 (753)

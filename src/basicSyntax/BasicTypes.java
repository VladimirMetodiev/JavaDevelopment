package basicSyntax;

public class BasicTypes {
    public static void main(String[] args) {
        // Типът на данните определя какви стойности може да приема дадена променлива, какви операции могат да се прилагат върху нея,
        // какъв е размерът на паметта, който заема, какви са стойностите ѝ по подразбиране.

        // Основните характеристики на типовете данни са: имe; размер (колко памет заема); стойности по подразбиране;

        // Вградени (примитивни) типове данни (built-in types): това са основните типове данни в един програмен език,
        // които са вградени в него на най-ниско ниво.

        // Типовете данни могат да се разделят на стойностни и референтни типове.
        // Стойностни типове данни (value types) – те се съхраняват в стека на паметта и пазят данните директно в себе си;
        // Референтните типове данни (reference types) - при тях в стека на паметта се съхранява името на променливата и референция
        // (препратка, връзка) към мястото (адреса) в динамичната памет (хийп), където се съхранява стойността на променливата.

        // Типовете данни double, float, long, int, short, byte, char и boolean се наричат примитивни.
        // Типовете данни double, float, long, int, short, byte са числови.
        // char е символен тип данни.
        // boolean е логически (булеви) тип данни.

        // Типовете String и Object представляват класове, които са дефинирани чрез средствата на езика Java, те
        // са част от стандартните библиотеки на Java, а не от самият език.
        // Object - обектен тип данни.
        // String - тип символен низ.



        // ЦЕЛОЧИСЛЕНИ ТИПОВЕ ЧИСЛА

        // Тип: byte
        // Размер: 8-bits == 1 byte;
        // Цяло число със знак: Диапазон от -128 до +127
        // Стойност по подразбиране 0;
        byte a = -128;
        byte b = +127;


        // Тип: short
        // Размер: 16-bits == 2 bytes;
        // Цяло число със знак: Диапазон от -32768 до +32767
        // Стойност по подразбиране 0;
        short c = -32768;
        short d = +32767;


        // Тип: int
        // Размер: 32-bits = 4 bytes;
        // Цяло число със знак: Диапазон от -2147483648 до +2147483647
        // Стойност по подразбиране 0;
        int e = -2147483648;
        int f = +2147483647;


        // Тип: long
        // Размер: 64-bits = 8 bytes;
        // Цяло число със знак: Диапазон от -9223372036854775808 до +9223372036854775807 (над 9 квинтилиона)
        // Стойност по подразбиране 0L;
        long g = -9223372036854775808L;
        long h = +9223372036854775807L;

        // Бележка: в Java, всички числови-типове, имат както положително, така и отрицателно значение



        // ЧИСЛА С ПЛАВАЩА ТОЧКА

        // Служат за представяне на дробни числа (реални числа)

        // Тип: float
        // Размер: 32-bits = 4 bytes;
        // Число с единична точност, с плаваща точка, със знак: Диапазон от +/-1.5 x 10^-45 до +/-3.4 x 10^38
        // Стойност по подразбиране 0.0f;
        float i = -0.123456789f;
        float j = +1.123456789F;


        // Тип: double
        // Размер: 64-bits = 8 bytes;
        // Число с двойна точност, с плаваща точка, със знак: Диапазон от +/-5.0 x 10^-324 до +/-1.7 x 10^308
        // Стойност по подразбиране 0.0;
        double k = -0.123456789d;
        double l = +1.123456789;



        // ЛОГИЧЕСКИ ТИП

        // Тип: boolean
        // Размер: 8-bits == 1 byte;
        // Стойности: true или false
        // Стойност по подразбиране false;
        boolean m = true;
        boolean n = false;



        // СИМВОЛЕН ТИП

        // Тип: char
        // Размер: 16-bits == 2 bytes;
        // Символ във формат UNICODE. Диапазон от '\u0000' (0) до '\uffff' (65535)
        // Стойност по подразбиране '\u0000';
        char o = 'a';
        char p = '\uffff';



        // ТИП СИМВОЛЕН НИЗ

        // Тип: String
        // Референтен тип
        // Символен низ във формат UNICODE.
        // Стойност по подразбиране null;
        String q = "java programming";
        String r = "JAVA PROGRAMMING";



        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
        System.out.println((int)p);
        System.out.println(q);
        System.out.println(r);
    }
}

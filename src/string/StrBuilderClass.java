package string;

public class StrBuilderClass {
    public static void main(String[] args) {
        /*
         * Класовете StringBuffer и StringBuilder са сходни, те имат едни и същи конструктори, едни и същи методи, и се използват
         * по сходен начин. Обектите на тези класове могат да се променят. Разликата между тях, е че класът StringBuffer е синхронизиран,
         * а StringBuilder не е синхронизиран.
         *
         * Класът StringBuilder не е синхронизиран и се използва в еднонишкови програми. В сравнение с StringBuffer работи много по-бързо.
         *
         * Конструкторът на StringBuilder - без параметри, първоначално запазва в паметта място за 16 символа, но може да бъде зададен
         * и различен капацитет, чрез конструктор с параметър capacity.
         */

        // Създаване на инстанция на клас StringBuilder

        // С конструктор без параметри
        StringBuilder sb1 = new StringBuilder();

        // С конструктор чиито параметър е capacity
        StringBuilder sb2 = new StringBuilder(128);

        // С конструктор, който приема символен низ
        String text = "Conceptually, a buffer is an array of primitive data elements wrapped inside an object.";
        StringBuilder sb3 = new StringBuilder(text);
        System.out.println(sb3.toString());


        System.out.println("--------->--------->--------->");


        // Дължина на символният низ - .length()
        System.out.println("Method .length() | " + sb1.length());
        System.out.println("Method .length() | " + sb3.length());


        System.out.println("--------->--------->--------->");


        // Размер на заделената памет в символи, за обект от тип StringBuffer - .capacity()
        System.out.println("Method .capacity() | " + sb1.capacity());
        System.out.println("Method .capacity() | " + sb2.capacity());
        System.out.println("Method .capacity() | " + sb3.capacity());


        System.out.println("--------->--------->--------->");


        // Увеличение на максималният размер на заделената памет в символи, за вече създаден обект - .ensureCapacity()
        sb1.ensureCapacity(64);
        sb2.ensureCapacity(1024);
        sb3.ensureCapacity(256);
        System.out.println("Method .ensureCapacity() | " + sb1.capacity());
        System.out.println("Method .ensureCapacity() | " + sb2.capacity());
        System.out.println("Method .ensureCapacity() | " + sb3.capacity());


        System.out.println("--------->--------->--------->");


        // Добавяне в края на текстов обект, от тип StringBuilder - .append()
        text = "The advantage of a Buffer class over a simple array is that it encapsulates data content and information about the data into a single object.";
        sb1.append('A');
        sb2.append(text);
        System.out.println("Method .append() | " + sb1);
        System.out.println("Method .append() | " + sb2);


        System.out.println("--------->--------->--------->");


        // Изтриване на подниз от символният низ - .delete()
        // Първият аргумент е стартовият индекс, а вторият аргумент е индексът на символа след изтрития подниз
        sb3.delete(62, 88);
        System.out.println("Method .delete(62, 88); | " + sb3);


        System.out.println("--------->--------->--------->");


        // Взимане на символът, намиращ се на зададеният индекс, в символният низ - .charAt()
        System.out.println("Method .charAt() | " + sb3.charAt(0));


        System.out.println("--------->--------->--------->");


        // Изтриване от низът на символа с указаният индекс - .deleteCharAt()
        sb1.append("bject!");
        System.out.println(sb1.toString());
        sb1.deleteCharAt(6);
        System.out.println("Method .deleteCharAt() | " + sb1);


        System.out.println("--------->--------->--------->");


        // Поставя нов символ, на позицията с указаният индекс, в символният низ - .setCharAt()
        System.out.println(sb1);
        sb1.setCharAt(0, 'O');
        System.out.println("Method .setCharAt() | " + sb1);


        System.out.println("--------->--------->--------->");


        // Задаване на нова дължина на вече съществуващ текстов низ - .setLength()
        // Ако дължината на StringBuilder се увеличи, тогава неговият низ се допълва в края с празни символи,
        // ако се намалява, тогава низът се съкращава. При задаване на дължина 0 се изтрива.
        sb3.setLength(12);
        System.out.println("Method .setLength(12) | " + sb3);
        sb3.setLength(0);
        System.out.println("Method .setLength(0)  | " + sb3);


        System.out.println("--------->--------->--------->");


        // Вмъкване на подниз във низът, на позицията с указаният индекс - .insert()
        sb3 = new StringBuilder("Word");
        System.out.println(sb3.toString());
        sb3.insert(3, 'l');
        System.out.println("Method .insert() | " + sb3);


        System.out.println("--------->--------->--------->");


        // Копиране на символите от текстов низ в char масив - .getChars()
        int startIndex = 19;
        int endIndex = 31;
        char[] buffer = new char[endIndex - startIndex];
        int begin = 0;
        sb2.getChars(startIndex, endIndex, buffer, begin);
        System.out.print("Method .getChars() | ");
        System.out.println(buffer);

        // startIndex - индекс на първият символ, който се копира
        // endIndex - индекс на първият символ, който не се копира
        // buffer - char масив
        // begin - индекс в char масива, от който започва записването, на копираните символи


        System.out.println("--------->--------->--------->");


        // Намиране на първият индекс, на който се намира даден подниз с метода .indexOf(), в противен случай връща -1
        System.out.println("Method .indexOf() | " + sb2.indexOf("array"));
        System.out.println("Method .indexOf() | " + sb2.indexOf("list"));

        // Намиране на последният индекс, на който се намира даден подниз с метода .lastIndexOf(), в противен случай връща -1
        System.out.println("Method .lastIndexOf() | " + sb2.lastIndexOf("information"));
        System.out.println("Method .lastIndexOf() | " + sb2.lastIndexOf("text"));


        System.out.println("--------->--------->--------->");


        // Взимане на подниз от даден символен низ - .substring()
        System.out.println("Method .substring() | " + sb2.substring(19)); // от индекс 19 до края
        System.out.println("Method .substring() | " + sb2.substring(19, 31)); // от индекс 19 до индекс 31 (без него)


        System.out.println("--------->--------->--------->");


        // Заместване на фрагмент от символният низ, с подниз - .replace()
        sb1 = new StringBuilder("Hello world!");
        sb1.replace(6, 11, "java");
        System.out.println("Method .replace() | " + sb1);


        System.out.println("--------->--------->--------->");


        // Обръщане на символният низ - .reverse()
        sb1 = new StringBuilder("avaJ");
        System.out.println("Method .reverse() | " + sb1.reverse());


        System.out.println("--------->--------->--------->");


        // Намаляване на капацитета на текстовият обект, до размера на символният низ - .trimToSize()
        System.out.println("Method .trimToSize()");
        System.out.println("Capacity | " + sb2.capacity());
        sb2.trimToSize();
        System.out.println("Capacity | " + sb2.capacity());
    }
}

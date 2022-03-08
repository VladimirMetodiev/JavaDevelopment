package set;

import java.util.Objects;
import java.util.TreeSet;

public class CompareSetElements {
    public static void main(String[] args) {
        TreeSet<Herdsman> herdsmen = new TreeSet<>();

        Herdsman h1 = new Herdsman("Ivan", 46);
        Herdsman h2 = new Herdsman("Georgy", 562);
        Herdsman h3 = new Herdsman("Ianko", 29);
        Herdsman h4 = new Herdsman("Boril", 1256);
        Herdsman h5 = new Herdsman("Dobromir", 46);
        herdsmen.add(h1);
        herdsmen.add(h2);
        herdsmen.add(h3);
        herdsmen.add(h4);

        // В създаденият от мен клас, трябва да имплементирам Comparable, защото в противен случай, ще бъде хвърлена java.lang.ClassCastException
        System.out.println(herdsmen);

        //Сортировката (съпоставянето) в TreeSet е направена по големина на стадото

        /*
         * ПРАВИЛО:
         * Когато създам някакъв клас и преопределя метода .equals() (и метода .hashCode()),
         * това трябва да бъде така направено, че:
         * a.equals(b) => true
         * и
         * a.compareTo(b) => 0
         */

        // В настоящият случай метода .compareTo() съпоставя само herd, затова в .equals() и .hashCode(), трябва да използвам само herd

        System.out.println(h1.equals(h5));
        System.out.println(h1.hashCode() == h5.hashCode());
    }
}

class Herdsman implements Comparable<Herdsman> {
    String name;
    int herd;

    Herdsman(String name, int herd) {
        this.name = name;
        this.herd = herd;
    }

    public String getName() {
        return name;
    }

    public int getHerd() {
        return herd;
    }

    public void setHerd(int herd) {
        this.herd = herd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Herdsman herdsman = (Herdsman) o;
        return herd == herdsman.herd;
    }

    @Override
    public int hashCode() {
        return Objects.hash(herd);
    }

    @Override
    public int compareTo(Herdsman herdsman) {
        return this.herd - herdsman.herd;
    }

    @Override
    public String toString() {
        return "Herdsman{" + "name='" + name + '\'' + ", herd=" + herd + '}';
    }
}
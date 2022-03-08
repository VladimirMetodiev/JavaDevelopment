package generics.pairs;

import java.util.Objects;

public class Pair<T, U> {
    private T first = null;
    private U second = null;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public static<T, U> Pair<T, U> of(T first, U second){
        return new Pair<>(first, second);
    }

    @Override
    public boolean equals(Object obj) {
        // Ако е един и същ обект
        if (this == obj) return true;
        // Ако параметъра е равен на null
        if (obj == null) return false;
        // Ако класовете не съвпадат
        if (this.getClass() != obj.getClass()) return false;
        // Тук вече знам, че обекта obj е от клас Pair
        // Изпълнението на кастинга ще даде тип Pair
        Pair<?, ?> pair = (Pair<?, ?>) obj;
        return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(first != null ? first : 0, second != null ? second : 0);
    }
}

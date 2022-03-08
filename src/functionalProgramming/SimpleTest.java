package functionalProgramming;

public interface SimpleTest<T, U extends T> {
    boolean test(T var1, U var2);
}

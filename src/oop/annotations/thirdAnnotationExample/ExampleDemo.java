package oop.annotations.thirdAnnotationExample;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@MyAnnotation
public class ExampleDemo {
    @MyAnnotation
    String name;
    double value;

    public ExampleDemo(String name, double value) {
        this.name = name;
        this.value = value;
    }

    @AnotherAnnotation
    public void increaseValue () {
        this.value *= 2.0;
    }

    @Override
    public String toString() {
        return "ExampleDemo{" + "name='" + name + '\'' + ", value=" + value + '}';
    }
}

// Анотацията MyAnnotation мога да я приложа към клас, поле, метод, локална променлива и т.н.;
// Пред имплементацията на AnotherAnnotation, съм поставил @Target(ElementType.METHOD), с което указвам, че може да се прилага само към методи;

@interface MyAnnotation {
}

@Target(ElementType.METHOD)
@interface AnotherAnnotation {
}
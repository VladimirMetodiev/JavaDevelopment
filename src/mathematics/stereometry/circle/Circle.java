package mathematics.stereometry.circle;

import static java.lang.Math.PI;

public class Circle {
    /*
     * За целите на експеримента:
     * 1. На полето radius ще поставя модификатор за достъп protected
     * 2. Няма да създавам getters и setters
     * 3. Ще създам файл (клас) StartCircle.java в същата папка - circle
     * 4. Извън папката circle ще създам следните класове, които наследяват клас Circle:
     *    - Cylinder
     *    - Cone
     *    - Sphere
     */

    protected double radius = 0.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return radius * radius * PI;
    }

    public double calculateCircumference() {
        return 2.0 * radius * PI;
    }

    @Override
    public String toString() {
        return String.format("Circle area = %.2f%nCircle circumference = %.2f%n", calculateArea(), calculateCircumference());
    }
}

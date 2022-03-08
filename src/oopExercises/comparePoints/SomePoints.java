package oopExercises.comparePoints;

import java.util.ArrayList;

public class SomePoints {
    int a, b;
    double distance;

    public SomePoints(int a, int b) {
        this.a = a;
        this.b = b;
        distance = calculateDistance(a, b);
    }

    double calculateDistance (int x, int y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    static ArrayList<SomePoints> sort (ArrayList<SomePoints> list) {
        for (int c = 0; c < list.size() - 1; c++) {
            SomePoints current;
            for (int d = c + 1; d < list.size(); d++) {
                if(list.get(c).distance > list.get(d).distance) {
                    current = list.get(c);
                    list.set(c, list.get(d));
                    list.set(d, current);
                }
            }
        }
        return list;
    }

    @Override
    public String toString() {
        return String.format("(%d; %d)", a, b);
    }
}

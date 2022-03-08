package genericsExercises.simpleLists;

/*
 * Разширено и подобрено решение
 */

public class SimpleList<T>  {
    private int size;
    private Object[] data;

    public SimpleList() {
        this.size = 0;
        this.data = new Object[10];
    }

    private void increase() {
        int length = data.length * 2;
        Object[] current = new Object[data.length];
        for(int y = 0; y < data.length; y++) current[y] = data[y];
        data = new Object[length];
        for(int z = 0; z < current.length; z++) data[z] = current[z];
    }

    public int size() {
        return size;
    }

    public void add(T value) {
        if(size == data.length) {
            increase();
        }

        data[size] = value;
        size++;
    }

    public String get (int index) {
        if(index >= 0 && index < size) return "" + data[index];
        else return "There isn't such index!";
    }

    public void set(int index, T value) {
        if(index >= 0 && index < size) data[index] = value;
        else System.out.println("There isn't such index!");
    }

    public void remove(int index) {
        if(index >= 0 && index < size) {
            for (int a = index + 1; a < size; a++) {
                data[a - 1] = data[a];
            }
            size--;
        }
        else {
            System.out.println("There isn't such index!");
        }
    }

    public void insert(int index, T value) {
        if(size == data.length) {
            increase();
        }

        if(index >= 0 && index < size) {
            size++;
            for (int b = size - 1; b >= index + 1; b--) {
                data[b] = data[b - 1];
            }
            data[index] = value;
        }
        else {
            System.out.println("There isn't such index!");
        }
    }

    // Ако търсената стойност е налична, трябва да върне нейният индекс
    public int find(T value) {
        for (int c = 0; c <  size; c++){
            if(data[c].equals(value)) return c;
        }
        return -1;
    }

    public static void getMessage() {
        System.out.println("Choose: \"size\", \"add\", \"get\", \"set\", \"remove\", \"insert\", \"find\", \"print\" or \"end\"");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int d = 0; d < size; d++) {
            if(d < size - 1) sb.append(data[d] + ", ");
            else sb.append(data[d]);
        }
        return sb.toString();
    }
}



//Условие

// Проектирайте параметризиран клас List
//    с полета size, data
//    и с методи size(), add(value), get(index), set(index, value), remove(index), insert(index, value) и find(value)



// Решение, с което получих 100/100

//public class SimpleList<T>  {
//    private int size;
//    private Object[] data;
//
//    public SimpleList() {
//        this.size = 0;
//        this.data = new Object[100];
//    }
//
//    public int size() {
//        return size;
//    }
//
//    public void add(T value) {
//        data[size] = value;
//        size++;
//    }
//
//    public String get (int index) {
//        if(index >= 0 && index < size) return "" + data[index];
//        else return "There isn't such index!";
//    }
//
//    public void set(int index, T value) {
//        if(index >= 0 && index < size) data[index] = value;
//    }
//
//    public void remove(int index) {
//        if(index >= 0 && index < size) {
//            for (int a = index + 1; a < size; a++) {
//                data[a - 1] = data[a];
//            }
//            size--;
//        }
//    }
//
//    public void insert(int index, T value) {
//        size++;
//        for (int b = size - 1; b >= index + 1; b--) {
//            data[b] = data[b - 1];
//        }
//        data[index] = value;
//    }
//
//    public int find(T value) {
//        for (int c = 0; c <  size; c++){
//            if(data[c].equals(value)) return c;
//        }
//        return -1;
//    }
//
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        for(int d = 0; d < size; d++) {
//            if(d < size - 1) sb.append(data[d] + ", ");
//            else sb.append(data[d]);
//        }
//        return sb.toString();
//    }
//}

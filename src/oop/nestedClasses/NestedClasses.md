#Вложени класове (вътрешни класове)

__Вложеният клас__ е деклариран вътре в друг клас (т.е. между отварящата се и затварящата се фигуративни скоби). Вложеният клас е член на външният клас, неговата област на действие (обхват) е в рамките на външният клас.

Има два вида вложени класове. Първият вид вложени класове се декларират с помощта на модификатора за достъп static, вторият вид се декларират без него. Нестатичните вложени класове се наричат вътрешни (__inner classes__).

+ __Видове вложени класове__
    + статични класове
    + вътрешни класове
    + локални (вътрешни) класове
    + анонимни (вътрешни) класове

За да създам инстанция на вложен клас, пред името му, трябва да укажа името на външният клас, а след него да добавя точка.
````
FirstOuterClass.Engine engine = new FirstOuterClass.Engine(256);
````

__Статичният вложен клас__ е подобен на обикновен външен клас, но се намира вътре в друг клас. Статичните вложени класове, могат да се използват и като обикновени външни класове.

```java
public class FirstOuterClass {
    String colour;
    int doorCount;
    Engine engine;

    public FirstOuterClass(String colour, int doorCount, Engine engine) {
        this.colour = colour;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return String.format("This %s vehicle has %d doors and an engine with %d horsepower.", colour, doorCount, engine.horsePower);
    }

    public static class Engine {
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return String.format("This engine has %d horsepower.", horsePower);
        }
    }
}
```
```java
public class StartFirstOuterClass {
    public static void main(String[] args) {
        FirstOuterClass.Engine engine = new FirstOuterClass.Engine(256);
        System.out.println(engine);
        FirstOuterClass theFirst = new FirstOuterClass("black", 4, engine);
        System.out.println(theFirst);
    }
}
```

Когато създавам инстанция на статичен вложен клас, е нужно да посоча и класа, който го съдържа.

Статичните вложени класове, могат да наследяват други класове. Също така други класове, могат да наследяват статични вложени класове, но след extends трябва да напиша _<името на външният клас>.<името на статичният вложен клас>_

Статичните вложени класове, имат модификатор public, защото ако имат модификатор private, няма да можем да създадем тяхна инстанция в друг клас.

Статичният вложен клас може да съдържа статични и нестатични елементи.

Статичният вложен клас има достъп до статичните елементи на външния клас, дори когато те са private.

Външният клас има достъп до елементите, на статичният вложен клас, дори въпросните елементи да имат модификатор private. 

````
Статично поле, на статичен вложен клас:

public void show () {
    System.out.println(Engine.countOfObjects);
}
````
````
Нестатично поле, на статичен вложен клас:

FirstOuterClass.Engine engine = new FirstOuterClass.Engine(256);
System.out.println(engine.horsePower);
````

__Вътрешен клас (inner class)__

Всеки обект на вътрешен клас, е свързан с обекта на външния клас. За да създам инстанция на вътрешен клас, трябва първо да създам инстанция на външния клас.

```java
public class SecondOuterClass {
    String colour;
    int doorCount;
    Engine engine;

    public SecondOuterClass(String colour, int doorCount) {
        this.colour = colour;
        this.doorCount = doorCount;
    }

    public SecondOuterClass(String colour, int doorCount, int horsePower) {
        this.colour = colour;
        this.doorCount = doorCount;
        this.engine = this.new Engine(horsePower);
    }

    @Override
    public String toString() {
        return String.format("This %s vehicle has %d doors and an engine with %d horsepower.", colour, doorCount, engine.horsePower);
    }

    /* Inner class */
    public class Engine {
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return String.format("This engine has %d horsepower.", horsePower);
        }
    }
}
```

Вътрешният клас може да съдържа само нестатични елементи, но също така може да съдържа константи, т.е поле, което е "public static final".

Вътрешният клас има достъп до всички елементи на външният клас.

Вътрешният клас може да има един или повече, свои вътрешни класове. Това обаче се счита за лоша практика.

__Локален вътрешен клас (local inner class)__

Локалният вътрешен клас се разполага в някакъв блок код, като например метод или конструктор. Локалният вътрешен клас не е елемент на външният клас, той е локален елемент за някакъв блок код.

```java
public class ThirdOuterClass {
    static Scanner input = new Scanner(System.in);

    public void getResult(){
        /* Local class */
        class Divide {
            private double x;
            private double y;

            public double getX() {
                return x;
            }

            public void setX(double x) {
                this.x = x;
            }

            public double getY() {
                return y;
            }

            public void setY(double y) {
                this.y = y;
            }

            public double calculate() {
                if(y == 0) throw new IllegalArgumentException("Can not divide by zero.");
                return x / y;
            }
        }

        try {
            Divide divide = new Divide();
            System.out.println("Enter the first number:");
            divide.setX(Double.parseDouble(input.nextLine()));
            System.out.println("Enter the second number:");
            divide.setY(Double.parseDouble(input.nextLine()));
            System.out.println(divide.calculate());
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
```
```java
public class Main {
    public static void main(String[] args) {
        ThirdOuterClass obj = new ThirdOuterClass(); // Създавам инстанция на външният клас
        obj.getResult(); // Извиквам метода на външният клас, в който се намира локалният клас
    }
}
```

Локалният вътрешен клас не може да бъде статичен.

Обхватът на локалния вътрешен клас е блокът, в който той се намира, т.е. мога да създам обект на локалният клас само в блокът код, в който се намира.

Локалният вътрешен клас има достъп до всички елементи на външният клас.

Локалният вътрешен клас може да се обръща към елементи на блока, в който е написан, при условие че те са final или effectively final.

Локалният вътрешен клас може да наследява различни класове и да имплементира интерфейси.


__Анонимен Клас__

Клас, който е дефиниран без име, се нарича анонимен клас. Анонимният клас може да бъде деклариран, като подклас на друг клас, или като имплементиращ определен интерфейс.

При анонимните класове, декларирането и създаването на инстанция, стават едновременно, на едно и също място.

````
Принципна схема на анонимен клас:
new SomeClass() { /* anonymous class body */ };
````

Анонимният клас връща референция към обект. Тази референция може да бъде присвоена на променлива.

````
SomeClass instance = new SomeClass() { /* anonymous class body */ };
````

Анонимният клас не може да има конструктор.

Анонимният клас може да се обръща дори към private елементи на външният клас, но трябва да има създаден обект на външният клас, чрез който да бъдат извикани.

```java
public interface MathOperation {
    double calculate(double x, double y);
}
```

```java
public class FourthOuterClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        /* Anonymous class */
        /* Анонимният клас имплементира интерфейсът MathOperation и пренаписва неговият метод calculate */

        MathOperation sum = new MathOperation() {
            @Override
            public double calculate(double x, double y) {
                return x + y;
            }
        };

        getMessage();
        double x = input.nextDouble();
        double y = input.nextDouble();
        System.out.println(sum.calculate(x, y));


        MathOperation subtraction = new MathOperation() {
            @Override
            public double calculate(double x, double y) {
                return x - y;
            }
        };

        getMessage();
        x = input.nextDouble();
        y = input.nextDouble();
        System.out.println(subtraction.calculate(x, y));


        MathOperation multiplication = new MathOperation() {
            @Override
            public double calculate(double x, double y) {
                return x * y;
            }
        };

        getMessage();
        x = input.nextDouble();
        y = input.nextDouble();
        System.out.println(multiplication.calculate(x, y));


        MathOperation division = new MathOperation() {
            @Override
            public double calculate(double x, double y) {
                if(y == 0) throw new IllegalArgumentException("Can not divide by zero.");
                return x / y;
            }
        };

        getMessage();
        x = input.nextDouble();
        y = input.nextDouble();
        try {
            System.out.println(division.calculate(x, y));
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void getMessage() {
        System.out.println("Enter x and y:");
    }
}
```

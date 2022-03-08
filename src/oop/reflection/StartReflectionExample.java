package oop.reflection;

import java.lang.reflect.*;
import java.util.Arrays;

public class StartReflectionExample {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        // Създаване на обект на класът Class (вариант 1)

        Class instance1 = Class.forName("oop.reflection.ReflectionExample");

        // Чрез метода .forName();
        // В скобите на метода трябва да напиша пътя до класът който ще бъде изследван;
        // В сигнатурата на метода main трябва да напиша throws ClassNotFoundException;


        // Създаване на обект на класът Class (вариант 2)

        Class instance2 = ReflectionExample.class;


        // Създаване на обект на класът Class (вариант 3)

        ReflectionExample rf = new ReflectionExample();
        Class instance3 = rf.getClass();

        // При третият вариант, първо трябва да се създаде обект на изследваният клас;
        // След което за създаването на обект на класът Class, от обекта на изследваният клас извикваме метода .getClass();



        // В Java съществува клас Field, в обекта на който се съдържа информация за присвоеното му поле
        Field idField = instance1.getField("id"); // взимам полето на id на класът ReflectionExample, в сигнатурата на main трябва да укажа NoSuchFieldException
        System.out.println("Type of id field is: " + idField.getType());
        System.out.println("------------------------------");

        // За да получа информация за всички полета с модификатори public и default на изследваният клас, използвам метода .getFields(), който връща масив от тип Field
        Field[] fields = instance1.getFields();
        for (Field f : fields) System.out.println(f);
        System.out.println("------------------------------");

        // За да получа информация за всички полета на изследваният клас, използвам метода .getDeclaredFields(), който връща масив от тип Field
        Field[] allFields = instance1.getDeclaredFields();
        for (Field f : allFields) System.out.println("Type of " + f.getName() + " = " + f.getType());
        System.out.println("------------------------------");



        // В Java съществува клас Method, в обекта на който се съдържа информация за присвоеният му метод
        Method methodIncreaseValue = instance1.getMethod("increaseValue"); // в скобите на .getMethod() указвам изследваният метод, в сигнатурата на main трябва да добавя NoSuchMethodException
        System.out.println("Name of the method is: " + methodIncreaseValue.getName());
        System.out.println("Return type of method increaseValue is: " + methodIncreaseValue.getReturnType());
        System.out.println("Parameter count = " + methodIncreaseValue.getParameterCount());
        System.out.println("Parameter types = " + Arrays.toString(methodIncreaseValue.getParameterTypes())); // .getParameterTypes() връща масив Class<?>[]
        System.out.println("------------------------------");

        Method methodSetValue = instance1.getMethod("setValue", double.class); // .getMethod() има 2 аргумента, първият е името на изследваният метод, а вторият типът на параметъра(-ите); ако изследваният метод няма параметри, вторият аргумент не се указва
        System.out.println("Name of the method is: " + methodSetValue.getName());
        System.out.println("Return type of method increaseValue is: " + methodSetValue.getReturnType());
        System.out.println("Parameter count = " + methodSetValue.getParameterCount());
        System.out.println("Parameter types = " + Arrays.toString(methodSetValue.getParameterTypes()));
        System.out.println("------------------------------");

        // За да получа информация за всички методи на изследваният клас, използвам метода .getMethods(), който връща масив от тип Method
        Method[] methods = instance1.getMethods();
        for(Method m : methods) {
            System.out.printf("Method %s has return type %s and %d parameter from %s type(s).%n", m.getName(), m.getReturnType(), m.getParameterCount(), Arrays.toString(m.getParameterTypes()));
        }
        System.out.println("------------------------------");

        // За да получа информация за всички декларирани методи на изследваният клас, използвам метода .getDeclaredMethods(), който връща масив от тип Method
        Method[] allMethods = instance1.getDeclaredMethods();
        for(Method m : allMethods) {
            System.out.printf("Method %s has return type %s and %d parameter from %s type(s).%n", m.getName(), m.getReturnType(), m.getParameterCount(), Arrays.toString(m.getParameterTypes()));
        }
        System.out.println("------------------------------");

        // За да получа информация за всички методи с модификатор public, които са декларирани в изследваният клас
        // Трябва да направя проверка за типа на модификатора -> if(Modifier.isPublic(m.getModifiers()))
        Method[] allPublicMethods = instance1.getDeclaredMethods();
        for(Method m : allPublicMethods) {
            if(Modifier.isPublic(m.getModifiers())) {
                System.out.printf("Method %s has return type %s and %d parameter from %s type(s).%n", m.getName(), m.getReturnType(), m.getParameterCount(), Arrays.toString(m.getParameterTypes()));
            }
        }
        System.out.println("------------------------------");



        // В Java съществува клас Constructor, в обекта на който се съдържа информация за конструктура на изследваният клас
        // За да получа информация за конструктор без параметри
        Constructor constructor1 = instance1.getConstructor(); // трябва да има конструктор без параметри, в противен случай ще хвърли грешка
        System.out.printf("Constructor has %d parameter, their types are: %s.%n", constructor1.getParameterCount(), Arrays.toString(constructor1.getParameterTypes()));
        System.out.println("------------------------------");

        // За да получа информация за конструктор с параметри, трябва да укажа ТИПА на параметрите, в скобите на метода .getConstructor()
        Constructor constructor2 = instance1.getConstructor(int.class, String.class, String.class);
        System.out.printf("Constructor has %d parameter, their types are: %s.%n", constructor2.getParameterCount(), Arrays.toString(constructor2.getParameterTypes()));
        System.out.println("------------------------------");

        // За да получа информация за всички конструктори
        Constructor[] constructors = instance1.getConstructors();
        for(Constructor c : constructors) {
            System.out.println("Constructor name: " + c.getName());
            System.out.println("Constructor has " + c.getParameterCount() + " parameters");
            System.out.println("Constructor types are: " + Arrays.toString(c.getParameterTypes()) + "\n");
        }
        System.out.println("------------------------------");



        // Нова инстанция на даден (изследван) клас, мога да създам с помоща на конструктор и метода .newInstance()
        Constructor<ReflectionExample> constructor3 = instance1.getConstructor();
        ReflectionExample newInstance = constructor3.newInstance();
        System.out.println(newInstance);
        System.out.println("------------------------------");

        Constructor<ReflectionExample> constructor4 = instance1.getConstructor(int.class, String.class, String.class, double.class);
        Object obj = constructor4.newInstance(1519, "Vladimir", "Falcon", 19.3456);
        System.out.println(obj);
        System.out.println("------------------------------");

        // Извикването на метод става с .invoke()
        Method method1 = instance1.getMethod("setValue", double.class);
        method1.invoke(obj, 19.3457);
        System.out.println(obj);
        System.out.println("------------------------------");



        // Получаване на достъп до private поле, става с метода .setAccessible()
        ReflectionExample rf1 = new ReflectionExample(2000, "Vladimir", "The sky is the limit", 500000);
        Class instance4 = rf1.getClass();
        Field field = instance4.getDeclaredField("value");
        field.setAccessible(true);

        double someRealNumber = (Double)field.get(rf1);
        System.out.println(someRealNumber);
        System.out.println(rf1);

        field.set(rf1, 600000);
        someRealNumber = (Double)field.get(rf1);
        System.out.println(someRealNumber);
        System.out.println(rf1);
        System.out.println("------------------------------");
    }
}

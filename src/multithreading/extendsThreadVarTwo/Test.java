package multithreading.extendsThreadVarTwo;

public class Test extends Thread {
    public static void main(String[] args ) throws InterruptedException {
        // създаване на препратка към основната нишка
        Thread chief = Thread.currentThread();

        // взимане на името на основната нишка
        System.out.println("Current thread: " + chief.getName());

        // промяна на името на основната нишка
        chief.setName("The_Boss");
        System.out.println("After name change: " + chief.getName());

        // взимане на приоритета на основната нишка
        System.out.println("Main thread priority: " + chief.getPriority());

        // задаване на приоритет на основната нишка на MAX = 10
        chief.setPriority(MAX_PRIORITY);

        System.out.println("Main thread new priority: " + chief.getPriority());

        // създаване на дъщерни нишки
        ChildThread theFirstEmployee = new ChildThread();
        ChildThread theSecondEmployee = new ChildThread();

        // промяна на имената на дъщерните нишки
        theFirstEmployee.setName("The_First");
        theSecondEmployee.setName("The_Second");

        // взимане на приоритета на дъщерните нишки, който (приоритет) е наследен от основната нишка
        System.out.println(theFirstEmployee.getName() + " child thread priority: " + theFirstEmployee.getPriority());
        System.out.println(theSecondEmployee.getName() + " child thread priority: " + theSecondEmployee.getPriority());

        // задаване на минимален приоритет MIN = 1
        theSecondEmployee.setPriority(MIN_PRIORITY);

        System.out.println(theSecondEmployee.getName() + " child thread new priority: " + theSecondEmployee.getPriority());

        // стартиране на дъщерните нишки
        theFirstEmployee.start();
        theSecondEmployee.start();

        for (int c = 0; c < 5; c++) {
            System.out.println("Main thread [" + (c + 1) + "]");
        }
    }
}

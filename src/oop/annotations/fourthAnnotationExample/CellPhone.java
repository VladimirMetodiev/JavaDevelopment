package oop.annotations.fourthAnnotationExample;

import java.lang.annotation.*;

public class CellPhone {
    public static void main(String[] args) throws ClassNotFoundException {
        Class xiaomiClass = Class.forName("oop.annotations.fourthAnnotationExample.Xiaomi");
        Annotation annotation1 = xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone sm1 = (SmartPhone)annotation1;
        System.out.printf("Annotation information from Xiaomi class: %s, %s%n", sm1.OS(), sm1.yearOfCompanyCreation());

        Class iphoneClass = Class.forName("oop.annotations.fourthAnnotationExample.Iphone");
        Annotation annotation2 = iphoneClass.getAnnotation(SmartPhone.class);
        SmartPhone sm2 = (SmartPhone)annotation2;
        System.out.printf("Annotation information from Iphone class: %s, %s%n", sm2.OS(), sm2.yearOfCompanyCreation());
    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
    String OS();
    int yearOfCompanyCreation();
}

// На елементите на анотацията могат да се задават стойности по подразбиране, а при поставяне на анотацията над съответстващият ѝ елемент,
// тези стойности могат и да не се указват, ако ни устройват.
//@Target(ElementType.TYPE)
//@Retention(RetentionPolicy.RUNTIME)
//@interface SmartPhone {
//    String OS() default "Android";
//    int yearOfCompanyCreation() default 2010;
//}

@SmartPhone(OS = "Android", yearOfCompanyCreation = 2010)
class Xiaomi {
    String model;
    double price;
}

@SmartPhone(OS = "IOS", yearOfCompanyCreation = 1976)
class Iphone {
    String model;
    double price;
}
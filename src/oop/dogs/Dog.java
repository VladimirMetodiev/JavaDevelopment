package oop.dogs;

import oop.enumClass.Size;

public class Dog {
    public static int dogCount = 0;
    private int paws = 4;
    private int tail = 1;
    private String bread = null;
    private String name = null;
    private Size size = null;     // small, average, big

    public Dog() { }

    public Dog(String bread, String name){
        this.bread = bread;
        this.name = name;
        dogCount++;
    }

    public int getPaws() {
        return this.paws;
    }

    public void setPaws(int paws) {
        if(paws >= 0 & paws <= 4) {
            this.paws = paws;
        }
        else{
            System.out.printf("The user tried to enter %s paws.%n", paws);
        }
    }

    public int getTail(){
        return this.tail;
    }

    public void setTail(int tail){
        if(tail == 1 | tail == 0) {
            this.tail = tail;
        }
        else{
            System.out.printf("The user tried to enter %s tail.%n", tail);
        }
    }

    public String getBread() {
        return this.bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(String size) {
        if(("big").equalsIgnoreCase(size)){
            this.size = Size.BIG;
        }
        else if(("average").equalsIgnoreCase(size)){
            this.size = Size.AVERAGE;
        }
        else if(("small").equalsIgnoreCase(size)){
            this.size = Size.SMALL;
        }
        else {
            System.out.println("Wrong size! Please, choose \"big\" or \"average\" or \"small\".");
        }
    }

    public void bark () {
        switch (size){
            case BIG: System.out.println("Baw-Baw"); break;
            case AVERAGE: System.out.println("Waw-Waw"); break;
            case SMALL: System.out.println("Jaf-Jaf"); break;
        }
    }

    public void bite () {
        if(this.size.equals(Size.BIG)){
            System.out.println("The dog can bite.");
        }
    }

    public static int getDogCount(){
        return dogCount;
    }
}



// Класът е шаблон, от който може да се създадът обекти

// Обектите се характеризират със състояние и поведение
// Всеки обект има свойства (или характеристики) [полета], те отговарят за състоянието на обекта
// Всеки обект има методи, те отговарят за поведението на обекта

// Член-данни - полета и методи
// Член-променлива [поле] - това е променлива на класът
// Член-метод - това е метод на класът

// Конструктор - специален метод, който служи за създаването на обекти. Той винаги е public, името му се изписва с
// главна буква, като то винаги е същото, както името на класът.

// Модификатори за достъп
// private - полето или методът е видим и достъпен само в даденият клас
// protected - полето или методът е видим и достъпен само в пакета, в който се намира класът
// модификатор по подразбиране (package-private, default) - полето или методът е видим и достъпен само в пакета, в който се намира класът
// public - полето или методът е видим и достъпен от всеки клас

// Принципна схема на обект - екземпляр на клас
// [клас на обекта][идентификатор (име)] = new[конструктор на класът];

// Getter - метод чрез, който взимам стойността на private поле
// Setter - метод чрез, който задавам или модифицирам стойността на private поле

// Константа - променлива чиято стойност, се задава още при нейното създаване и която не може да се променя.
// Имената на константите в Java се изписват с главни букви.
// За да създам константа пред типът на променливата пиша: static final

// Клас Enum се използва за изброяване, т.е. за създаване на списък с именувани константи, които дефинират нов тип данни
// и неговите валидни стойности.
// Изброяване се създава с ключовата дума enum.
// Стойностите в Enum клас се наричат: константи от изброим тип.
// Обект от Enum клас не се създава с ключовата дума new.
// Екземпляр на Enum клас се обявява по следният начин: Apple apple;
// Присвояването на значение на екземпляр от Enum клас се извършва по следният начин: apple = Apple.RedDel;

// За да създам екземпляр на друг клас, трябва да импортирам този друг клас.

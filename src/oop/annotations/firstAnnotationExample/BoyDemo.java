package oop.annotations.firstAnnotationExample;

public class BoyDemo {
    public static void main(String[] args) {
        Boy boy = new Child("Alexander");
        boy.showInfo();
    }
}

class Boy {
    String name;

    public Boy (String name) {
        this.name = name;
    }

    void showInfo () {
        System.out.println("This is \"Boy class\". Field name = " + name);
    }
}

class Child extends Boy {
    public Child (String name) {
        super(name);
    }

    @Override
    void showInfo () {
        System.out.println("This is \"Child class\". Field name = " + name);
    }

    // @Override – показва, че декларацията на метода е предназначена да замени декларацията на метода в суперкласа
}
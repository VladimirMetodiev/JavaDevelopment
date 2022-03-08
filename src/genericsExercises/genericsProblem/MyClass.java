package genericsExercises.genericsProblem;

public class MyClass<E> {
    private E attribute;

    MyClass(E var){
        this.attribute = var;
    }

    public E get(){
        return this.attribute;
    }

    public void set(E value){
        this.attribute = value;
    }

    public static<E> boolean equals(E obj1, E obj2){
        return obj1.equals(obj2);
    }
}

package generics.studyExperimentThree;

public class NonStaticMethod {
    String name;

    NonStaticMethod() {
    }

    NonStaticMethod(String name) {
        this.name = name;
    }

    <T> void set(T obj){
        name = obj.toString();
    }

    <T> T get(T[] objects, char symbol){
        int index = name.indexOf(symbol);

        if(index < 0) index = 0;

        if(index >= objects.length) index = objects.length - 1;

        return objects[index];
    }

    public String toString(){
        return String.format("Class-field: %s", name);
    }
}

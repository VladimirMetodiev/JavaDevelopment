package generics.studyGenInterface;

public class TheFirstClass implements GenInterfaceOne<String> {
    public void display(String str){
        System.out.println(str);
    }
}

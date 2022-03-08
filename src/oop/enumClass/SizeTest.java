package oop.enumClass;

public class SizeTest {
    public static void main(String[] args) {
        // Дефиниране на екземпляр от изброим тип
        Size size;


        // Инициализиране
        size = Size.BIG;

        Size size1 = Size.VERY_SMALL;
        Size size2 = Size.SMALL;

        String value = "AVERAGE";
        Size size3 = Size.HUGE;

        try {
            size3 = Size.valueOf(value);
        }
        catch (IllegalArgumentException ex) {
            System.out.println("There isn't such constant!\n");
        }


        // Сравняване
        System.out.println(size1.compareTo(size1));
        System.out.println(size1.compareTo(size2));
        System.out.println(size1.compareTo(size3) + "\n");

        if(size == Size.HUGE){
            System.out.println(Size.HUGE + "\n");
        }
        else if(size == Size.BIG){
            System.out.println(Size.BIG + "\n");
        }
        else if(size == Size.AVERAGE){
            System.out.println(Size.AVERAGE + "\n");
        }
        else if(size == Size.SMALL){
            System.out.println(Size.SMALL + "\n");
        }
        else if(size == Size.VERY_SMALL){
            System.out.println(Size.VERY_SMALL + "\n");
        }


        // Взимане на "поредната стойност", която показва позицията на константата в списъка с константи от изброим тип
        System.out.println(Size.BIG.ordinal() + "\n");


        // Превръщане на всичките стойности на Enum клас в масив
        Size[] sizeArray = Size.values();


        // Принтиране на всичките стойности на Enum клас
        for (Size element : sizeArray){
            System.out.print(element + " ");
        }
        System.out.println("\n");

        for (int a = 0; a < sizeArray.length; a++){
            if(a < Size.values().length - 1){
                System.out.print(sizeArray[a] + ", ");
            }
            else{
                System.out.print(sizeArray[a] + ";");
            }
        }

    }
}

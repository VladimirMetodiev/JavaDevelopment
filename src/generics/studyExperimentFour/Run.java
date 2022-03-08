package generics.studyExperimentFour;

public class Run {
    public static void main(String[] args) {
        UsualClass usualClass = new UsualClass(823543);

        WorkingClass workingClass1 = new WorkingClass(893);
        System.out.println(workingClass1.expression);

        WorkingClass workingClass3 = new WorkingClass(usualClass);
        System.out.println(workingClass3.expression);

        WorkingClass workingClass2 = new WorkingClass("No great mind has ever existed without a touch of madness.");
        System.out.println(workingClass2.expression);
    }
}


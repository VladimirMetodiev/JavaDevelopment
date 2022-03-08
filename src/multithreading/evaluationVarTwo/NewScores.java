package multithreading.evaluationVarTwo;

public class NewScores {
    public static void main(String[] args) {
        char[] marks = {'A', 'B', 'C', 'D', 'E'};
        String[] assessment = {"Excellent", "Very good", "Good", "Fair", "Poor"};
        String name = "Evaluation";

        new NewCriteria(marks, name);

        for(String element : assessment){
            try {
                Thread.sleep(1150);
            }
            catch (InterruptedException ex) {
            }

            System.out.println(element);
        }
    }
}

package oopExercises.hierarchyOfEmployees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StartStaff {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Developer developer = new Developer("Vladimir Metodiev", "experiment1516@gmail.com", 3, "Java", new String[]{"Java", "SQL", "JavaScript", "HTML", "CSS"});
        DataAnalyst analyst = new DataAnalyst("Alexander Dimitrov", "experiment8283@gmail.com", 5, true, new String[]{"CFA", "ACCA", "neural networks", "decision tree", "bayesian algorithms"});

        System.out.println(developer);
        System.out.println(analyst);

        reader.close();
    }
}



//Condition

//Develop a class hierarchy of employees. The hierarchy should include three classes:

//Employee is the base class. It includes three fields (name, email and experience), one constructor with three arguments
// and three getters: getName(), getEmail(), getExperience().

//Developer is a subclass. It includes fields from the base class and two additional fields (mainLanguage, skills),
//one constructor with five arguments and two getters: getMainLanguage(), getSkills().

//DataAnalyst is another subclass. It includes fields from the base class and two additional fields (phd, methods),
//one constructor with five arguments and two getters: isPhD(), getMethods().

//You need to define types of the fields and write suitable constructors.

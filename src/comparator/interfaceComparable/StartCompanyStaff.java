package comparator.interfaceComparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StartCompanyStaff {
    public static void main(String[] args) {
        ArrayList<EmployeeOfTheCompanyAlpha> staff = new ArrayList<>(Arrays.asList(new EmployeeOfTheCompanyAlpha(101, "Vladimir", "Metodiev", 5000.0),
                new EmployeeOfTheCompanyAlpha(302, "Victor", "Todorov", 1500.0),
                new EmployeeOfTheCompanyAlpha(201, "Anna", "Dimitrova", 5000.0),
                new EmployeeOfTheCompanyAlpha(104, "Ivan", "Gerdjikov", 1500.0),
                new EmployeeOfTheCompanyAlpha(301, "Ivan", "Melnishky", 3000.0),
                new EmployeeOfTheCompanyAlpha(202, "Svetoslava", "Atanasova", 1250.0),
                new EmployeeOfTheCompanyAlpha(103, "Eva", "Trendafilova", 1500.0),
                new EmployeeOfTheCompanyAlpha(303, "Victor", "Ivanov", 1500.0),
                new EmployeeOfTheCompanyAlpha(102, "Peter", "Borislavov", 2000.0)));

        // За да може Collections.sort да сортира списъкът трябва да имплементирам интерфейсът Comparable
        Collections.sort(staff);

        staff.forEach(el -> System.out.printf("ID[%d] %s %s gets a salary of %.2f%n", el.getId(), el.getName(), el.getSurname(), el.getSalary()));
    }
}


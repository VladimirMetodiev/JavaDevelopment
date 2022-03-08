package comparator.interfaceComparable;

public class EmployeeOfTheCompanyAlpha implements Comparable<EmployeeOfTheCompanyAlpha> {
    private int id;
    private String name;
    private String surname;
    private double salary;

    public EmployeeOfTheCompanyAlpha () { }

    public EmployeeOfTheCompanyAlpha (int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public EmployeeOfTheCompanyAlpha(int id, String name, String surname, double salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Преди да съм пренаписал метода на интерфейса, в IntelliJ IDEA класът е подчертан с червено, а над него "свети" червена лампичка.
    // Кликам върху нея и се отваря падащо меню. От него избирам опцията implement methods. След което IntelliJ IDEA генерира шаблон на метода.

//    Първи начин

    @Override
    public int compareTo(EmployeeOfTheCompanyAlpha anotherEmployee) {
        // this е текущият обект, а anotherEmployee е обекта с който се сравнява
        if(this.id > anotherEmployee.id) {
            return 1;
        }
        else if(this.id < anotherEmployee.id) {
            return -1;
        }
        else {
            return 0;
        }
    }

//    Втори начин

//    @Override
//    public int compareTo(EmployeeOfTheCompanyAlpha anotherEmployee) {
//        return this.id - anotherEmployee.id;
//    }

//    Трети начин (Ако променя int id на Integer id)

//    @Override
//    public int compareTo(EmployeeOfTheCompanyAlpha anotherEmployee) {
//        return this.id.compareTo(anotherEmployee.id);
//    }

//    Четвърти начин

//    @Override
//    public int compareTo(EmployeeOfTheCompanyAlpha anotherEmployee) {
//        int result = this.name.compareTo(anotherEmployee.name);
//        if(result == 0) {
//            return this.surname.compareTo(anotherEmployee.surname);
//        }
//        else{
//            return result;
//        }
//    }
}

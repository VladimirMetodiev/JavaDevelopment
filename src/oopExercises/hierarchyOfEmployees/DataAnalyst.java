package oopExercises.hierarchyOfEmployees;

public class DataAnalyst extends Employee {
    private boolean phD;
    private String[] methods;

    public DataAnalyst(String name, String email, int experience, boolean phD, String[] methods) {
        super(name, email, experience);
        this.phD = phD;
        this.methods = methods;
    }

    public boolean isPhD() {
        return phD;
    }

    public String[] getMethods() {
        return methods;
    }

    public String toString(){
        return String.format("Name: %s%ne-mail: %s%nexperience: %d%nPhD: %s%n", getName(), getEmail(), getExperience(), phD ? "Yes" : "No");
    }
}

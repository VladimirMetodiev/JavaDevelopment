package oopExercises.hierarchyOfEmployees;

public class Developer extends Employee {
    private String mainLanguage;
    private String[] skills;

    public Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills;
    }

    public String getMainLanguage() {
        return mainLanguage;
    }

    public String[] getSkills() {
        return skills;
    }

    public String toString(){
        return String.format("Name: %s%ne-mail: %s%nexperience: %d%nmain language: %s%n", getName(), getEmail(), getExperience(), mainLanguage);
    }
}

package comparatorExercises.school;

public class PersonalFile extends Student {
    private int classYear;
    private String designation;
    private String dateOfBirth;

    public PersonalFile(String surname, String name, String schoolClass, String dateOfBirth) {
        super(surname, name);
        classYear = Integer.parseInt(schoolClass.substring(0, schoolClass.length() - 1));
        designation = Character.toString(schoolClass.charAt(schoolClass.length() - 1));
        this.dateOfBirth = dateOfBirth;
    }

    public int getClassYear() {
        return classYear;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public String toString() {
        String schoolClass = classYear + designation;
        return String.format("%s %s %s %s", schoolClass, super.getSurname(), super.getName(), dateOfBirth);
    }
}

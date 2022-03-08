package oopExercises.forum;

public class User extends Person {
    private String email;
    private String password;
    private Status status;

    public User() {
    }

    public User(String name, String surname, Sex sex, int age, String email, String password, Status status) {
        super(name, surname, sex, age);
        this.email = email;
        this.password = password;
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %s", super.getName(), super.getSurname(), super.getAge(), status);
    }
}

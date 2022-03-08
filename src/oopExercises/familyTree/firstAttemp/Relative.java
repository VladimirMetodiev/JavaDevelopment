package oopExercises.familyTree.firstAttemp;

import java.util.ArrayList;

public class Relative {
    private String firstName = "";
    private String lastName = "";
    private String birthDate = "";
    private ArrayList<Integer> parents = new ArrayList<>();
    private ArrayList<Integer> children = new ArrayList<>();

    public Relative(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Relative(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public ArrayList<Integer> getParents() {
        return parents;
    }

    public void setParents(ArrayList<Integer> parents) {
        this.parents = parents;
    }

    public ArrayList<Integer> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Integer> children) {
        this.children = children;
    }
}

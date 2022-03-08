package oopExercises.trackedPeople;

import java.util.ArrayList;

public class TrackedPerson {
    private String name;
    private Company company = new Company("");
    private ArrayList<Pokemon> pokemon = new ArrayList<>();
    private ArrayList<Parent> parents = new ArrayList<>();
    private ArrayList<Child> children = new ArrayList<>();
    private OwnCar car = new OwnCar("");

    public TrackedPerson(String name) {
        this.name = name;
    }

    public void setCompany(String companyName, String department, double salary) {
        company = new Company(companyName, department, salary);
    }

    public void setPokemon(String pokemonName, String pokemonType) {
        pokemon.add(new Pokemon(pokemonName, pokemonType));
    }

    public void setParents(String parentName, String parentBirthday) {
        parents.add(new Parent(parentName, parentBirthday));
    }

    public void setChildren(String childName, String childBirthday) {
        children.add(new Child(childName, childBirthday));
    }

    public void setCar(String carModel, int carSpeed) {
        car = new OwnCar(carModel, carSpeed);
    }

    public String getName() {
        return name;
    }

    public Company getCompany() {
        return company;
    }

    public ArrayList<Pokemon> getPokemon() {
        return pokemon;
    }

    public ArrayList<Parent> getParents() {
        return parents;
    }

    public ArrayList<Child> getChildren() {
        return children;
    }

    public OwnCar getCar() {
        return car;
    }
}

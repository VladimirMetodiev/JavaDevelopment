package oopExercises.pizzaCalories;

public class Dough {
    private DoughType type;
    private DoughType kind;
    private double weight;

    public Dough(String type, String kind, double weight) {
        this.setType(type);
        this.setKind(kind);
        this.setWeight(weight);
    }

    public DoughType getType() {
        return type;
    }

    public void setType(String str) {
        DoughType type;

        switch (str.toLowerCase()) {
            case "white": type = DoughType.WHITE; break;
            case "wholegrain": type = DoughType.WHOLEGRAIN; break;
            default: type = DoughType.UNKNOWN; break;
        }

        if(type != DoughType.WHITE && type != DoughType.WHOLEGRAIN) throw new IllegalArgumentException("Invalid type of dough.");
        this.type = type;
    }

    public DoughType getKind() {
        return kind;
    }

    public void setKind(String str) {
        DoughType kind;

        switch (str.toLowerCase()) {
            case "crispy": kind = DoughType.CRISPY; break;
            case "chewy": kind = DoughType.CHEWY; break;
            case "homemade": kind = DoughType.HOMEMADE; break;
            default: kind = DoughType.UNKNOWN; break;
        }

        if(kind != DoughType.CRISPY && kind != DoughType.CHEWY && kind != DoughType.HOMEMADE) throw new IllegalArgumentException("Invalid type of dough.");
        this.kind = kind;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight < 1 || weight > 200) throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        this.weight = weight;
    }

    public double calculateDoughCalories(){
        return 2.0 * weight * type.getModifier() * kind.getModifier();
    }
}

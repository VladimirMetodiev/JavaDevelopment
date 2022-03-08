package oopExercises.pizzas;

import oopExercises.Deliverable;

public class Pizza implements Deliverable {
    private String name = null;
    private int quantity = 0;
    private double price = 0.0;
    private double discount = 0.0;
    private double cost = 0.0;
    private Size size;

    public Pizza() {
    }

    public Pizza(String name, int quantity, double price, String size) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        switch (size){
            case "s": this.size = Size.S; break;
            case "m": this.size = Size.M; break;
            case "l": this.size = Size.L; break;
            case "xl": this.size = Size.XL; break;
            default: this.size = Size.M; break;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(String size) {
        switch (size){
            case "s": this.size = Size.S; break;
            case "m": this.size = Size.M; break;
            case "l": this.size = Size.L; break;
            case "xl": this.size = Size.XL; break;
            default: this.size = Size.M; break;
        }
    }

    public double getDiscount() {
        return discount;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public double calculateDeliveryPrice() {
        if(quantity >= 3){
            discount += 0.07;
        }
        else if(quantity > 1){
            discount += 0.03;
        }

        if(size == Size.S){
            price -= price * 0.05;
        }
        else if(size == Size.L || size == Size.XL ){
            price += price * 0.05;
        }

        cost = (price - price * discount) * quantity;

        return cost;
    }

    @Override
    public String toString(){
        return String.format("Pizza: %s%nQuantity: %d%nPrice: %.2f%nSize: %s%nCost: %.2f%nDiscount: %.1f%%", name, quantity, price, size, cost, discount * 100);
    }
}

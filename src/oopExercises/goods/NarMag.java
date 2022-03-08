package oopExercises.goods;

import oopExercises.Deliverable;

public class NarMag implements Deliverable {
    private String tradeItem = null;
    GoodsType type = null;
    private int quantity = 0;
    private double price = 0.0;
    private double discount = 0.0;
    private double cost = 0.0;
    public static double total = 0.0;

    public NarMag() {
    }

    public NarMag(String tradeItem, String type, int quantity, double price) {
        this.tradeItem = tradeItem;
        if(type.equalsIgnoreCase("smartphone")) this.type = GoodsType.SMARTPHONE;
        else if(type.equalsIgnoreCase("computer")) this.type = GoodsType.COMPUTER;
        else if(type.equalsIgnoreCase("tv_set")) this.type = GoodsType.TV_SET;
        else if(type.equalsIgnoreCase("music_system")) this.type = GoodsType.MUSIC_SYSTEM;
        else if(type.equalsIgnoreCase("game_console")) this.type = GoodsType.GAME_CONSOLE;
        else if(type.equalsIgnoreCase("software")) this.type = GoodsType.SOFTWARE;
        else if(type.equalsIgnoreCase("white_equipment")) this.type = GoodsType.WHITE_EQUIPMENT;
        else if(type.equalsIgnoreCase("accessories")) this.type = GoodsType.ACCESSORIES;
        else if(type.equalsIgnoreCase("cosmetics")) this.type = GoodsType.COSMETICS;
        else if(type.equalsIgnoreCase("clothes")) this.type = GoodsType.CLOTHES;
        else if(type.equalsIgnoreCase("toy")) this.type = GoodsType.TOY;
        else if(type.equalsIgnoreCase("sports_equipment")) this.type = GoodsType.SPORTS_EQUIPMENT;
        else this.type = GoodsType.UNKNOWN;
        this.quantity = quantity;
        this.price = price;
    }

    public String getTradeItem() {
        return tradeItem;
    }

    public void setTradeItem(String tradeItem) {
        this.tradeItem = tradeItem;
    }

    public GoodsType getType() {
        return type;
    }

    public void setType(String type) {
        if(type.equalsIgnoreCase("smartphone")) this.type = GoodsType.SMARTPHONE;
        else if(type.equalsIgnoreCase("computer")) this.type = GoodsType.COMPUTER;
        else if(type.equalsIgnoreCase("tv_set")) this.type = GoodsType.TV_SET;
        else if(type.equalsIgnoreCase("music_system")) this.type = GoodsType.MUSIC_SYSTEM;
        else if(type.equalsIgnoreCase("game_console")) this.type = GoodsType.GAME_CONSOLE;
        else if(type.equalsIgnoreCase("software")) this.type = GoodsType.SOFTWARE;
        else if(type.equalsIgnoreCase("white_equipment")) this.type = GoodsType.WHITE_EQUIPMENT;
        else if(type.equalsIgnoreCase("accessories")) this.type = GoodsType.ACCESSORIES;
        else if(type.equalsIgnoreCase("cosmetics")) this.type = GoodsType.COSMETICS;
        else if(type.equalsIgnoreCase("clothes")) this.type = GoodsType.CLOTHES;
        else if(type.equalsIgnoreCase("toy")) this.type = GoodsType.TOY;
        else if(type.equalsIgnoreCase("sports_equipment")) this.type = GoodsType.SPORTS_EQUIPMENT;
        else this.type = GoodsType.UNKNOWN;
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

    @Override
    public double calculateDeliveryPrice() {
        switch (type){
            case TOY: {
                if(quantity >= 3) discount += 0.02;
                if(price >= 200) discount += 0.02;
                break;
            }
            case TV_SET: {
                if(quantity >= 2) discount += 0.05;
                if(price >= 3000) discount += 0.07;
                else if(price >= 2000) discount += 0.05;
                else if(price >= 1000) discount += 0.03;
                break;
            }
            case CLOTHES: {
                if(quantity >= 2) discount += 0.02;
                if(price >= 350) discount += 0.02;
                break;
            }
            case COMPUTER: {
                if(quantity >= 2) discount += 0.095;
                if(price >= 2000) discount += 0.08;
                else if(price >= 1000) discount += 0.04;
                break;
            }
            case SOFTWARE: {
                if(quantity >= 3) discount += 0.05;
                else if(quantity == 2) discount += 0.03;
                if(price >= 750) discount += 0.04;
                break;
            }
            case COSMETICS: {
                if(quantity >= 3) discount += 0.05;
                else if(quantity == 2) discount += 0.03;
                if(price >= 150) discount += 0.02;
                break;
            }
            case SMARTPHONE: {
                if(quantity >= 2) discount += 0.05;
                if(price >= 1000) discount += 0.03;
                break;
            }
            case ACCESSORIES: {
                if(quantity >= 3) discount += 0.05;
                else if(quantity == 2) discount += 0.03;
                if(price >= 180) discount += 0.02;
                break;
            }
            case GAME_CONSOLE: {
                if(quantity >= 2) discount += 0.05;
                if(price >= 1500) discount += 0.05;
                break;
            }
            case MUSIC_SYSTEM: {
                if(quantity >= 2) discount += 0.07;
                if(price >= 1200) discount += 0.05;
                break;
            }
            case WHITE_EQUIPMENT: {
                if(price >= 1350) discount += 0.05;
                break;
            }
            case SPORTS_EQUIPMENT: {
                if(quantity >= 5) discount += 0.09;
                else if(quantity == 4) discount += 0.07;
                else if(quantity == 3) discount += 0.05;
                else if(quantity == 2) discount += 0.03;
                if(price >= 700) discount += 0.05;
                break;
            }
            default: break;
        }

        cost += (price - price * discount) * quantity;
        total += cost;

        return cost;
    }

    @Override
    public String toString(){
        return String.format("Trade item: %s%nQuantity: %d%nPrice: %.2f%nDiscount: %.1f%%%nCost: %.2f", tradeItem, quantity, price, discount * 100, cost);
    }
}

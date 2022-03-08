package oop.innerClassesPractice;

public class CellPhone {
    private String producer = null;
    private String model = null;
    private Display display;
    private CellModule smartPhone;

    public CellPhone(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    public void turnOn(){
        initDisplay();
        smartPhone = new CellModule();
    }

    public void call(String number){
        smartPhone.call(number);
    }

    private void initDisplay(){
        display = new Display();
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }
}

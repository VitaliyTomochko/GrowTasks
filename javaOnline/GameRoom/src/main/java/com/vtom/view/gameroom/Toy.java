package com.vtom.view.gameroom;

public class Toy {

    private ToyType toyType;
    private ToyKind toyKind;
    private ToySize size;
    private String name;
    private double price;

    public Toy(ToyType toyType, ToyKind toyKind, ToySize size, String name, double price) {

        this.toyType = toyType;
        this.toyKind = toyKind;
        this.size = size;
        this.name = name;
        this.price = price;
    }

    public Toy() {

    }

    public ToyKind getToyKind() {
        return toyKind;
    }

    public void setToyKind(ToyKind toyKind) {
        this.toyKind = toyKind;
    }

    public ToyType getToyType() {
        return toyType;
    }

    public void setToyType(ToyType toyType) {
        this.toyType = toyType;
    }

    public ToySize getSize() {
        return size;
    }

    public void setSize(ToySize size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "toyType=" + toyType +
                ", toyKind=" + toyKind +
                ", size=" + size +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

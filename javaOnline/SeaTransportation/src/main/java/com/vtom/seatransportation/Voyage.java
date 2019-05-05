package com.vtom.seatransportation;

public class Voyage {
    private String from;
    private String to;
    private double price;
    private double weight;

    public Voyage() {

    }

    public Voyage(String from, String to, double price, double weight) {

        this.from = from;
        this.to = to;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Voyage{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

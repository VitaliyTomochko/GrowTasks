package com.vtom.stonemarket;

class Stone {

    private String name;
    private int weight;
    private double price;
    private StoneClarity stoneClarity;
    private StoneValue stoneValue;

    public Stone() {

    }

    public Stone(String name, int weight, double price, StoneClarity stoneClarity, StoneValue stoneValue) {

        this.name = name;
        this.weight = weight;
        this.price = price;
        this.stoneClarity = stoneClarity;
        this.stoneValue = stoneValue;
    }

    @Override
    public String toString() {
        return "com.vtom.stonemarket.Stone{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", stoneClarity=" + stoneClarity +
                ", stoneValue=" + stoneValue +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public StoneClarity getStoneClarity() {
        return stoneClarity;
    }

    public void setStoneClarity(StoneClarity stoneClarity) {
        this.stoneClarity = stoneClarity;
    }

    public StoneValue getStoneValue() {
        return stoneValue;
    }

    public void setStoneValue(StoneValue stoneValue) {
        this.stoneValue = stoneValue;
    }
}

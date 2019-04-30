package com.vtom.view.hypermarket.Plumbings;

import com.vtom.view.hypermarket.Plumbing;

public class Sink extends Plumbing {

    private final String color;

    public Sink(double price,
                String manufacturer,
                MaterialType materialType,
                String color) {
        super(price, manufacturer, materialType);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sink{" +
                super.toString() +
                "color='" + color + '\'' +
                '}';
    }
}

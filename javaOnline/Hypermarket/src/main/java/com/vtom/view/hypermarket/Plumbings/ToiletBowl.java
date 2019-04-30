package com.vtom.view.hypermarket.Plumbings;

import com.vtom.view.hypermarket.Plumbing;

public class ToiletBowl extends Plumbing {


    public ToiletBowl(double price,
                      String manufacturer,
                      MaterialType materialType) {
        super(price, manufacturer, materialType);
    }

    @Override
    public String toString() {
        return "ToiletBowl{" +
                super.toString() +
                '}';
    }
}

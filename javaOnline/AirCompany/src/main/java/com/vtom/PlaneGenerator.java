package com.vtom;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PlaneGenerator {

    private List<Plane> planes = new ArrayList<>();


    public PlaneGenerator() {
        createplane();
    }

    public List<Plane> getPlanes() {
        return planes;
    }

    void createplane() {
        int count = PlaneType.values().length;
        while (count-- > 0) {

            planes.add(new Plane((new Random().nextInt(300) + 20)
                    , (new Random().nextInt(600) + 20)
                    , (new Random().nextInt(1000) + 20)
                    , (new Random().nextInt(3000) + 20)
                    , getPlaneType()));
        }
    }


    public PlaneType getPlaneType() {
        PlaneType[] VALUES = PlaneType.values();
        return VALUES[new Random().nextInt(VALUES.length)];
    }


}
package com.vtom.view.gameroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class ToyGenerator {

    private static final Random RANDOM = new Random();
    private Toy toy;

    public Toy getToy() {
        return toy;
    }

    public void createStack() {

        toy = new Toy();
         toy.setToyType(generateType());
       // toy.setToyType(ToyType.Animals);
        toy.setSize(generateSize());
        toy.setPrice(generatePrice());
        toy.setToyKind(generateToyKind());

    }

    public ToyType generateType() {
        ToyType[] VALUES = ToyType.values();
        return VALUES[RANDOM.nextInt(VALUES.length)];
    }

    public ToySize generateSize() {
        ToySize[] VALUES = ToySize.values();
        return VALUES[RANDOM.nextInt(VALUES.length)];
    }




    public double generatePrice() {

        Random ran = new Random();
        if (toy.getSize() == ToySize.Small) {

            return (ran.nextInt(20) + 10) + 0.99;
        } else if (toy.getSize() == ToySize.Medium) {
            return (ran.nextInt(30) + 30) + 0.99;
        } else return (ran.nextInt(60) + 100) + 0.99;
    }

    public ToyKind generateToyKind() {
        List<ToyKind> VALUES = new ArrayList<>();
        for (ToyKind elem : ToyKind.values()) {
            if (elem.getGroupName().equals(toy.getToyType().name())) {
                VALUES.add(elem);
            }
        }
        return VALUES.get(RANDOM.nextInt(VALUES.size()));
    }
}

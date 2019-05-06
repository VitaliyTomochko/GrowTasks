package com.vtom.stonemarket;

import java.util.Collections;
import java.util.List;

public class StoneManager implements IStoneManager {

    List<Stone> stoneList;
    Menu menu = new Menu();

    public StoneManager(List<Stone> stoneList) {
        this.stoneList = stoneList;
    }

    @Override
    public void sortByPrice() {
        Collections.sort(stoneList, (o1, o2) -> Double.compare(o2.getPrice(), o1.getPrice()));
       showStones();
    }


    @Override
    public void sortByWeight() {
        Collections.sort(stoneList, (o1, o2) -> Integer.compare(o2.getWeight(), o1.getWeight()));
        showStones();
    }

    @Override
    public void findByClarity(String clarity) {

        for (Stone elem : stoneList) {
            if (elem.getStoneClarity().name().equalsIgnoreCase(clarity)) {
                System.out.println(elem.toString());
            }

        }
    }

    @Override
    public void findByValue(String value) {
        for (Stone elem : stoneList) {
            if (elem.getStoneValue().name().equalsIgnoreCase(value)) {
                System.out.println(elem.toString());
            }

        }
    }

    @Override
    public void showStones() {
        System.out.println(menu.printResult(stoneList));
    }


//    public void print() {
//
//
//        for (Stone stone : stoneList) {
//
//            System.out.println(stone.toString());
//        }
//    }
}

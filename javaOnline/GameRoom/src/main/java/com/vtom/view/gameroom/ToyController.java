package com.vtom.view.gameroom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ToyController implements IToy {
    List<Toy> toys;

    public ToyController(List<Toy> toys) {
        this.toys = toys;
    }

    @Override
    public void searchByType(String str) {

    }

    @Override
    public void searchByKind(String str) {
        List<Toy> kinds=new ArrayList<>();

        for(Toy elem:toys){
            if(elem.getToyKind().name().equals(str)){

               kinds.add(elem);
            }

        }

        System.out.println(new Menu(kinds).printResult());

    }

    @Override
    public void searchBySize(String str) {

        List<Toy> kinds=new ArrayList<>();

        for(Toy elem:toys){
            if(elem.getSize().name().equals(str)){

                kinds.add(elem);
            }

        }

        System.out.println(new Menu(kinds).printResult());

    }

    @Override
    public void sortByPrice() {
        Collections.sort(toys, (o1, o2) -> Double.compare(o2.getPrice(), o1.getPrice()));
    }


}

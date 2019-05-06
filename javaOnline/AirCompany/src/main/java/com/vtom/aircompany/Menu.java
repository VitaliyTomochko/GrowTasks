package com.vtom.aircompany;

import de.vandermeer.asciitable.AsciiTable;
import de.vandermeer.asciithemes.a7.A7_Grids;

import java.util.List;

public class Menu {


    Menu() {
        printMenu();
    }


    public void printMenu() {


        System.out.println("1 Show planes ");
        System.out.println("2 findByFuelLessThan ");
        System.out.println("3 sortByLoadCapacity ");
        System.out.println("4 sortByDistance ");
        System.out.println("5 Exit ");

    }

    public String printResult(List<Plane> planes) {


        AsciiTable at = new AsciiTable();

        at.addRule();
        at.addRow("Plane", "Load capacity", "Distance", "Fuel amount", "Seats amount");
        at.getContext().setWidth(50).setGrid(A7_Grids.minusBarPlusEquals());

        for (Plane elem : planes) {
            at.addRule();
            at.addRow(elem.getPlaneType(), elem.getLoadCapacity(), elem.getDistance(), elem.getFuelAmount() , elem.getSeatsAmount());
        }
        at.addRule();

        return at.render();
    }
}


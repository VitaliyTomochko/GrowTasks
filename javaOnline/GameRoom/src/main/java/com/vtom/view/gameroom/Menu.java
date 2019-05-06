package com.vtom.view.gameroom;

import de.vandermeer.asciitable.AsciiTable;
import de.vandermeer.asciithemes.a7.A7_Grids;

import java.util.*;

public class Menu  {

    List<Toy> toys;


    public Menu(List<Toy> toys) {
        this.toys = toys;
    }


    public void printMenu() {


        System.out.println("1 Show toys ");
        System.out.println("2 Sort by price ");
        System.out.println("3 Find toys by type ");
        System.out.println("4 Find toys by kind ");
        System.out.println("5 Find toys by size ");
        System.out.println("6 Exit ");

    }

    public String printResult() {


        AsciiTable at = new AsciiTable();

        at.addRule();
        at.addRow("ToyType", "ToyKind", "ToySize", "Price$");
        at.getContext().setWidth(50).setGrid(A7_Grids.minusBarPlusEquals());

        for (Toy elem : toys) {
            at.addRule();
            at.addRow(elem.getToyType(), elem.getToyKind(), elem.getSize(), elem.getPrice() + "$");
        }
        at.addRule();

        return at.render();
    }

    public void printSubmenu() {

    }
}

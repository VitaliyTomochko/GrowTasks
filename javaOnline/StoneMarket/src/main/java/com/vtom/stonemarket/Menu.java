package com.vtom.stonemarket;

import de.vandermeer.asciitable.AsciiTable;
import de.vandermeer.asciithemes.a7.A7_Grids;

import java.util.List;

public class Menu {


    public void printMenu() {


        System.out.println("0 Show stones ");
        System.out.println("1 sortByPrice ");
        System.out.println("2 sortByWeight ");
        System.out.println("3 findByClarity ");
        System.out.println("4 findByValue ");
        System.out.println("5 Exit ");

    }

    public String printResult(List<Stone> stones) {


        AsciiTable at = new AsciiTable();

        at.addRule();
        at.addRow("Name", "Price", "Clarity", "Value","Weight");
        at.getContext().setWidth(50).setGrid(A7_Grids.minusBarPlusEquals());

        for (Stone elem : stones) {
            at.addRule();
            at.addRow(elem.getName(), elem.getPrice()+"$", elem.getStoneClarity(), elem.getStoneValue(), elem.getWeight());
        }
        at.addRule();

        return at.render();
    }

}

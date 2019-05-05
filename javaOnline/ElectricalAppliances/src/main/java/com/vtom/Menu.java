package com.vtom;

import de.vandermeer.asciitable.AsciiTable;
import de.vandermeer.asciithemes.a7.A7_Grids;

import java.util.List;

public class Menu {

    Menu() {
        printMenu();
    }


    public void printMenu() {


        System.out.println("1 Show devices ");
        System.out.println("2 SortByPower ");
        System.out.println("3 ShowOnlyTurnOn ");
        System.out.println("4 PlugIn ");
        System.out.println("5 Exit ");

    }

    public String printResult(List<ElectricDevice> devices) {


        AsciiTable at = new AsciiTable();

        at.addRule();
        at.addRow("Name", "Power consumption", "Status");
        at.getContext().setWidth(50).setGrid(A7_Grids.minusBarPlusEquals());

        for (ElectricDevice elem : devices) {
            at.addRule();
            at.addRow(elem.getName(), elem.getPowerConsumption(), elem.isStatus());
        }
        at.addRule();

        return at.render();

    }
}

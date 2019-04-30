package com.vtom;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ElectricDeviceManager manager = new ElectricDeviceManager();


        manager.createDevices();


        boolean exit = false;

        do {

            switch (new Scanner(System.in).nextInt()) {
                case 1:
                    manager.showAllData();
                    break;
                case 2:
                    manager.sortByPower();
                    break;
                case 3:
                    manager.showOnlyTurnOn();
                    break;
                case 4:
                    manager.plugIn(new Scanner(System.in).nextLine());
                    break;
                case 5:

                    break;
                case 8:

                    break;
                default:
                    System.out.println("");
            }

        } while (true);

    }
}

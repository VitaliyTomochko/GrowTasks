package com.vtom;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ElectricDeviceManager manager = new ElectricDeviceManager();


        manager.createDevices();


        boolean exit = true;
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
                    System.out.println("Choose device");
                    manager.plugIn(new Scanner(System.in).nextLine());
                    break;
                case 5:
                    exit = false;
                    break;
                default:
                    System.out.println("");
            }

        } while (exit);

    }
}

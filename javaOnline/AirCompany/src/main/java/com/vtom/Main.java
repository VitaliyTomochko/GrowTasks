package com.vtom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PlaneGenerator planeGenerator = new PlaneGenerator();
        PlaneController planeController = new PlaneController(planeGenerator.getPlanes());


        boolean exit = true;
        do {

            switch (new Scanner(System.in).nextInt()) {
                case 1:
                    planeController.showPlanes();
                    break;
                case 2:
                    System.out.println("enter fuel capacity: ");
                    planeController.findByFuelLessThan(new Scanner(System.in).nextInt());
                    break;
                case 3:
                    planeController.sortByLoadCapacity();
                    break;
                case 4:
                    planeController.sortByDistance();
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

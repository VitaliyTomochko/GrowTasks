package com.vtom.stonemarket;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StoneGenerator stoneGenerator = new StoneGenerator();
        stoneGenerator.create();


        List<Stone> stones = stoneGenerator.getStone();
        StoneManager manager = new StoneManager(stones);


        boolean exit = true;
        do {
            manager.menu.printMenu();
            switch (Integer.parseInt(new Scanner(System.in).nextLine())) {
                case 0:
                    manager.showStones();
                    break;
                case 1:
                    manager.sortByPrice();
                    break;
                case 2:
                    manager.sortByWeight();
                    break;
                case 3:
                    manager.findByClarity(new Scanner(System.in).nextLine());
                    break;
                case 4:
                    manager.findByValue(new Scanner(System.in).nextLine());
                    break;
                case 5:
                    exit = false;
                    break;
                default:
                    System.out.println("");
                    break;
            }

        } while (exit);
    }
}

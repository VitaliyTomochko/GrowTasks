package com.vtom.view.gameroom;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ToyController tc;
        Menu menu;
        ToyGenerator tg = new ToyGenerator();
        List<Toy> toys = new ArrayList<>();
        double moneyAmount;
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the amount of money:");
        moneyAmount = Double.parseDouble(scanner.nextLine());


        while (moneyAmount > 0) {
            tg.createStack();

            toys.add(tg.getToy());
            moneyAmount -= tg.getToy().getPrice();

        }

        System.out.println("Choose action");
        do {
            menu = new Menu(toys);
            tc = new ToyController(toys);
            menu.printMenu();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    System.out.println(menu.printResult());
                    break;
                case 2:
                    break;
                case 3:
                    tc.sortByPrice();
                    System.out.println(menu.printResult());
                    break;
                case 4:

                    tc.searchByKind(scanner.nextLine());

                    break;

                case 5:

                    tc.searchBySize(scanner.nextLine());

                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong number");
            }

        } while (true);


        // System.out.println(toys.toString());


    }
}

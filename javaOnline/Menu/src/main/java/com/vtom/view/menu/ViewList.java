package com.vtom.view.menu;


import com.vtom.ElectricDevice;
import com.vtom.view.gameroom.Main;
import com.vtom.view.hypermarket.Hypermarket;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Consumer;

public class ViewList {

    static Map<String, Consumer<String[]>> views = new HashMap<>();

    static {

        views.put("Gameroom", Main::main);
        views.put("Hypermarket", Hypermarket::main);
        views.put("StoneMarket", Hypermarket::main);
        views.put("ElectricalAppliances", Hypermarket::main);
    }


    public static void main(String[] args) {
        while (true) {
            System.out.println("Choose project(Enter name):");

            for (Map.Entry<String, Consumer<String[]>> elem : views.entrySet()) {
                System.out.println(elem.getKey());

            }


            Scanner scanner = new Scanner(System.in);

            String str = scanner.nextLine();

            Optional<Map.Entry<String, Consumer<String[]>>> view = views.entrySet()
                    .stream()
                    .filter(entry -> entry.getKey().equalsIgnoreCase(str)).findFirst();


            view.ifPresent(stringViewEntry -> stringViewEntry.getValue().accept(new String[]{}));

            if (str.equalsIgnoreCase("exit")) break;

            else System.out.println("invalid menu.Please repeat");
        }

    }

}

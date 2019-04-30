package com.vtom.view.menu;


import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Consumer;

public class ViewList {

    static Map<String, Consumer<String[]>> views = new HashMap<>();

    static {

        views.put("Gameroom", com.vtom.view.gameroom.Main::main);
        views.put("Hypermarket", com.vtom.view.hypermarket.Hypermarket::main);
    }


    public static void main(String[] args) {
        while (true) {
            System.out.println("Choose project:");

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

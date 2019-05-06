package com.vtom.aircompany;

import java.util.List;
import java.util.stream.Collectors;

public class PlaneController {
    private List<Plane> planes;
    private Menu menu;

    public PlaneController(List<Plane> planes) {
        this.planes = planes;
        menu = new Menu();
    }

    public void showPlanes() {

        System.out.println(menu.printResult(planes));
    }


    public void findByFuelLessThan(int fuel) {
        System.out.println(menu.printResult(planes.stream()
                .filter(plane -> plane.getFuelAmount() < fuel)
                .collect(Collectors.toList())));
    }

    public void sortByDistance() {
        System.out.println(menu.printResult(planes.stream()
                .sorted((o1, o2) -> o2.getDistance() - o1.getDistance())
                .collect(Collectors.toList())));

    }

    public void sortByLoadCapacity() {
        System.out.println(menu.printResult(planes.stream()
                .sorted((o1, o2) -> o2.getLoadCapacity() - o1.getLoadCapacity())
                .collect(Collectors.toList())));
    }


}

package com.vtom;

import com.vtom.KitchenDevices.*;
import com.vtom.LivingRoomDevices.AirConditioner;
import com.vtom.LivingRoomDevices.PlayStation;
import com.vtom.LivingRoomDevices.TVSet;
import com.vtom.OfficeDevices.Printer;
import com.vtom.OfficeDevices.Router;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class ElectricDeviceManager {

    private List<LivingRoomAppliance> livingRoomDevices = new ArrayList<>();
    private List<KitchenAppliance> kitchenDevices = new ArrayList<>();
    private List<OfficeAppliance> officeDevices = new ArrayList<>();

    private List<ElectricDevice> allDevices = new ArrayList<>();


    void createDevices() {

        livingRoomDevices.add(new AirConditioner("Gree", generatePower(), true));
        livingRoomDevices.add(new PlayStation("PlayStation4", generatePower(), true));
        livingRoomDevices.add(new TVSet("TV", generatePower(), true));

        kitchenDevices.add(new ElectricOven("Oven", generatePower(), false));
        kitchenDevices.add(new Fridge("Fridge", generatePower(), true));
        kitchenDevices.add(new Ketle("Ketle", generatePower(), false));
        kitchenDevices.add(new MIcrowaveOven("Microwave", generatePower(), false));
        kitchenDevices.add(new Toster("Toster", generatePower(), false));


        officeDevices.add(new Printer("Printer", generatePower(), false));
        officeDevices.add(new Router("Router", generatePower(), false));

    }

    private int generatePower() {

        return new Random().nextInt(200) + 50;
    }

    public void showAllData() {

        Stream.of(kitchenDevices.stream(), livingRoomDevices.stream(), officeDevices.stream())
                .flatMap(s -> s).forEach(device -> {
            System.out.println(device.toString());
        });

    }



    public void sortByPower() {
        Stream.of(kitchenDevices.stream(), livingRoomDevices.stream(), officeDevices.stream())
                .flatMap(s -> s)
                .sorted(Comparator.comparingInt(ElectricDevice::getPowerConsumption))
                .forEach(System.out::println);
    }


    public void showOnlyTurnOn() {
        Stream.of(kitchenDevices.stream(), livingRoomDevices.stream(), officeDevices.stream())
                .flatMap(s -> s)
                .filter(ElectricDevice::isStatus)
                .forEach(System.out::println);
    }

    public void plugIn(String deviceName) {
        Stream.of(kitchenDevices.stream(), livingRoomDevices.stream(), officeDevices.stream())
                .flatMap(s -> s)
                .filter(name->name.getName().equalsIgnoreCase(deviceName))
                .forEach(ElectricDevice::connectToNetwork);
    }

    public void findByPower(int power) {

    }

    public void sortItemList() {

    }


}

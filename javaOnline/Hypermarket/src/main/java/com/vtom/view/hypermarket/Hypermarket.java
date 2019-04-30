package com.vtom.view.hypermarket;

import com.vtom.view.hypermarket.Plumbings.ShowerCabin;
import com.vtom.view.hypermarket.Plumbings.Sink;
import com.vtom.view.hypermarket.WoodProducts.Door;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import static com.vtom.view.hypermarket.Plumbing.buildFilter;
import static com.vtom.view.hypermarket.Plumbing.onlySinks;

public class Hypermarket{

    public static void main(String[] args) {

        List<List<? extends Category>> goods = initMarket();
        //print goods
        for (List<? extends Category> elem : goods)
            elem.stream()
                    .filter(onlySinks)
                    .filter(buildFilter(160))
                    .forEach(System.out::println);

        System.out.println();

        Comparator<Sink> comparator = Comparator.comparing(Plumbing::getManufacturer);

        for (List<? extends Category> elem : goods)
            elem.stream()
                    .filter(onlySinks)
                    .map(category -> (Sink) category)
                    .sorted(comparator)
                    .forEach(System.out::println);
    }



    private static List<List<? extends Category>> initMarket() {


        List<List<? extends Category>> goods = new ArrayList<>();
        List<Plumbing> sinks = new ArrayList<>();

        sinks.add(new Sink(randomPrice(),
                "Cersanit",
                Plumbing.MaterialType.Ceramic,
                "White"));

        sinks.add(new Sink(randomPrice(),
                "Boсh",
                Plumbing.MaterialType.Ceramic,
                "White"));

        sinks.add(new Sink(randomPrice(),
                "Colombo",
                Plumbing.MaterialType.Ceramic,
                "White"));

        sinks.add(new Sink(randomPrice(),
                "Idevit",
                Plumbing.MaterialType.Ceramic,
                "White"));

        sinks.add(new Sink(randomPrice(),
                "Cersanit",
                Plumbing.MaterialType.Ceramic,
                "White"));

        sinks.add(new Sink(randomPrice(),
                "Boсh",
                Plumbing.MaterialType.Granite,
                "White"));

        sinks.add(new Sink(randomPrice(),
                "Colombo",
                Plumbing.MaterialType.Granite,
                "White"));

        sinks.add(new Sink(randomPrice(),
                "Idevit",
                Plumbing.MaterialType.Granite,
                "White"));


        sinks.add(new Sink(randomPrice(),
                "Cersanit",
                Plumbing.MaterialType.StainlessSteel,
                "White"));

        sinks.add(new Sink(randomPrice(),
                "Boсh",
                Plumbing.MaterialType.StainlessSteel,
                "White"));


        goods.add(sinks);

        List<Plumbing> showerCabins = new ArrayList<>();

        showerCabins.add(new ShowerCabin(randomPrice(),
                "Radaway",
                Plumbing.MaterialType.Ceramic));

        showerCabins.add(new ShowerCabin(randomPrice(),
                "Radaway",
                Plumbing.MaterialType.Ceramic));

        showerCabins.add(new ShowerCabin(randomPrice(),
                "Santeh",
                Plumbing.MaterialType.Granite));

        showerCabins.add(new ShowerCabin(randomPrice(),
                "Santeh",
                Plumbing.MaterialType.Granite));

        List<Wooden> wooden = new ArrayList<>();

        wooden.add(new Door(randomPrice(),
                "Kronos",
                Wooden.WoodType.Oak));

        wooden.add(new Door(randomPrice(),
                "Karpaty",
                Wooden.WoodType.Pine));
        goods.add(wooden);
        wooden.add(new Door(randomPrice(),
                "Kronos",
                Wooden.WoodType.Beech));

        wooden.add(new Door(randomPrice(),
                "Karpaty",
                Wooden.WoodType.Oak));
        goods.add(wooden);
        wooden.add(new Door(randomPrice(),
                "Kronos",
                Wooden.WoodType.Pine));

        wooden.add(new Door(randomPrice(),
                "Karpaty",
                Wooden.WoodType.Birch));
        goods.add(wooden);


        return goods;
    }

    public static double randomPrice() {
        Random r = new Random();
        return r.nextInt((170 - 100) + 1) + 100 + 0.99;
    }

}

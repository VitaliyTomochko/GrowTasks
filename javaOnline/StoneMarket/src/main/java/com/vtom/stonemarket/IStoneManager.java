package com.vtom.stonemarket;

public interface IStoneManager {

    void sortByPrice();

    void sortByWeight();


    void findByClarity(String clarity);

    void findByValue(String value);

    void showStones();
}

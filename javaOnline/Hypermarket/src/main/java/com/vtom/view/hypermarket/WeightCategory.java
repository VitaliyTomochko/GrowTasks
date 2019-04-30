package com.vtom.view.hypermarket;

public enum WeightCategory {
    Light,Medium,Heavy;

    public static WeightCategory f(int weight){
        if(weight>0 && weight<1000) return Light;
        else if (weight>=1000 & weight<10_000) return Medium;
        else return Heavy;


    }
}

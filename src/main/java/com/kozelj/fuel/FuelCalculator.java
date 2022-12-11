package com.kozelj.fuel;

public class FuelCalculator {

    public Integer calculateNeededFuel(Integer moduleWeight) {
        return (moduleWeight / 3) - 2;
    }

    public Integer calculateFullNeededFuel(Integer moduleWeight) {
        int totalFuel = 0;
        Integer currentWeight = moduleWeight;

        while (true) {
            int neededFuel = (currentWeight / 3) - 2;
            if (neededFuel < 0) {
                break;
            }

            totalFuel += neededFuel;
            currentWeight = neededFuel;
        }

        return totalFuel;
    }

}

package com.kozelj.modules;

import com.kozelj.fuel.FuelCalculator;
import com.kozelj.parser.LineReader;

import java.util.List;

public class ModulesStatistics {
    private final List<Integer> moduleWeights;

    public ModulesStatistics(String moduleWeightsFile) {
        this.moduleWeights = new LineReader().readLines(moduleWeightsFile).stream().map(Integer::parseInt).toList();
    }

    public Integer calculateNeededFuel() {
        var fuelCalculator = new FuelCalculator();

        return moduleWeights.stream().mapToInt(fuelCalculator::calculateNeededFuel).sum();
    }

    public Integer calculateFullNeededFuel() {
        var fuelCalculator = new FuelCalculator();

        return moduleWeights.stream().mapToInt(fuelCalculator::calculateFullNeededFuel).sum();
    }
}

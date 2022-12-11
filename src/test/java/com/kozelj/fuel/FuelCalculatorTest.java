package com.kozelj.fuel;

import com.kozelj.modules.ModulesStatistics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FuelCalculatorTest {

    @ParameterizedTest
    @CsvSource({"12,2", "14,2", "1969,654", "100756,33583"})
    public void shouldCalculateNeededFuel(Integer input, Integer expected) {
        var fuelCalculator = new FuelCalculator();

        Assertions.assertEquals(expected, fuelCalculator.calculateNeededFuel(input));
    }

    @Test
    public void shouldCalculateNeededFuel() {
        var fuelCalculator = new FuelCalculator();

        Assertions.assertEquals(50346, fuelCalculator.calculateFullNeededFuel(100756));
    }

    @Test
    public void shouldCalculateTotalNeededFuel() {
        var modulesStatistics = new ModulesStatistics("day-01/example.txt");

        Assertions.assertEquals(34241, modulesStatistics.calculateNeededFuel());
    }

    @Test
    public void shouldCalculateTotalNeededFuelFull() {
        var modulesStatistics = new ModulesStatistics("day-01/example.txt");

        Assertions.assertEquals(34241, modulesStatistics.calculateNeededFuel());
    }
}

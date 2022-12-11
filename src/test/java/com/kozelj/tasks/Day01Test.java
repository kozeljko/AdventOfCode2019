package com.kozelj.tasks;

import com.kozelj.modules.ModulesStatistics;
import org.junit.jupiter.api.Test;

public class Day01Test {

    @Test
    public void taskOne() {
        var modulesStatistics = new ModulesStatistics("day-01/task.txt");

        System.out.println(modulesStatistics.calculateNeededFuel());
    }

    @Test
    public void taskTwo() {
        var modulesStatistics = new ModulesStatistics("day-01/task.txt");

        System.out.println(modulesStatistics.calculateFullNeededFuel());
    }

}

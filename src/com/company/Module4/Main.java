package com.company.Module4;

import static com.company.Module1.CityUtil.parse;
import static com.company.Module1.Main.NAME_FILE;
import static com.company.Module4.CityStatistics.statistics;

public class Main {
    public static void main(String[] args) {
        System.out.println(statistics(parse(NAME_FILE)));
    }
}

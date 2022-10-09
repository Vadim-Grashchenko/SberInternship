package com.company.Module3;

import static com.company.Module1.CityUtil.parse;
import static com.company.Module1.Main.NAME_FILE;
import static com.company.Module3.CityMax.cityMax;

public class Main {
    public static void main(String[] args) {
        System.out.println(cityMax(parse(NAME_FILE)));
    }
}

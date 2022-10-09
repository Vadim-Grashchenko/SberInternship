package com.company.Module2;

import static com.company.Module1.CityUtil.parse;
import static com.company.Module1.Main.NAME_FILE;
import static com.company.Module2.CitySort.sortDistrict;
import static com.company.Module2.CitySort.sortName;

public class Main {
    public static void main(String[] args) {
        System.out.println(sortDistrict(sortName(parse(NAME_FILE))));
    }
}

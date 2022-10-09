package com.company.Module2;

import com.company.Module1.City;

import javax.naming.InsufficientResourcesException;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class CitySort {

    public static List<City> sortName(List<City> cities) {

       return cities.stream()
                .sorted((i1, i2) -> CharSequence.compare(i2.getName().toLowerCase(Locale.ROOT),
                                                            i1.getName().toLowerCase(Locale.ROOT)))
                .toList();
    }

    public static List<City> sortDistrict(List<City> cities) {

        return cities.stream()
                .sorted((i1, i2) -> CharSequence.compare(i1.getDistrict().toLowerCase(Locale.ROOT),
                                                            i2.getDistrict().toLowerCase(Locale.ROOT)))
                .collect(Collectors.toList());
    }
}

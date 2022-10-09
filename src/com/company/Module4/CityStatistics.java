package com.company.Module4;

import com.company.Module1.City;

import java.util.*;

public class CityStatistics {
    public static Map<String, Integer> statistics(List<City> cities) {

        Map<String, Integer> stat = new HashMap<>();
        List<String> region = new ArrayList<>();
        int q = 0;

        for (City city : cities) {
            region.add(city.getRegion());
        }

        List<String> list = new ArrayList<>();
        Set<String> uniqueValues = new HashSet<>();
        for (String s : region) {
            if (uniqueValues.add(s)) {
                list.add(s);
            }
        }
        region = list;

        for(int i = 0; i < region.size(); i++){
            for(int j = 0; j < cities.size(); j++){
                if(Objects.equals(region.get(i), cities.get(j).getRegion())) {
                    q++;
                }

            }
            stat.put(region.get(i), q);
            q = 0;
        }
        return stat;


    }
}

package com.company.Module3;

import com.company.Module1.City;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class CityMax {
    
    public static Map<Integer, Integer> cityMax(List<City> cities) {

        int[] arrCity = new int[cities.size()];
        Map<Integer, Integer> res= new HashMap<>();
        int max = 0;
        int j = 0;
        
        for(int i = 0; i < cities.size(); i++) {
            arrCity[i] = cities.get(i).getPopulation();
            
            if (max < arrCity[i]) {
                max = arrCity[i];
                j = i;
            }
        }

        res.put(j, max);

        return res;
    }
}

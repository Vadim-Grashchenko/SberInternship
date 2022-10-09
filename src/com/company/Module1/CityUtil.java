package com.company.Module1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CityUtil {

    public static List<City> parse(String file) {

        List<String> arrCities = new ArrayList<>();

        try {
            FileReader reader  = new FileReader(new File(file));
            Scanner scanner = new Scanner(reader);

            while (scanner.hasNextLine()) {
                arrCities.add(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return arrCities.stream()
                .map(i -> i.split(";"))
                .map(i -> {
                    if (i.length == 6) {
                        return new City(i[1], i[2], i[3], Integer.parseInt(i[4]), i[5]);
                    } else {
                        return new City(i[1], i[2], i[3], Integer.parseInt(i[4]), "No data available");
                    }
                })
                .toList();
    }
}

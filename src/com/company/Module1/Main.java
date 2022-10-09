package com.company.Module1;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static com.company.Module1.CityUtil.parse;

public class Main {

    public final static String NAME_FILE = "city_ru.csv";

    public static void main(String[] args) {

        System.out.println(parse(NAME_FILE));

    }
}

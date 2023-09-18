package com.ua.glebkorobov;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LocalDate> unsorted = new ArrayList<>();

        unsorted.add(LocalDate.of(2005, 7, 1));
        unsorted.add(LocalDate.of(2005, 1, 2));
        unsorted.add(LocalDate.of(2005, 1, 1));
        unsorted.add(LocalDate.of(2005, 5, 3));

        DateSorter dateSorter = new DateSorter();

        Collection<LocalDate> sorted = dateSorter.sortDates(unsorted);
        System.out.println(sorted);
    }
}
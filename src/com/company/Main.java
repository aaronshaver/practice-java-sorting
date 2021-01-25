package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(4);
        ints.add(1);
        ints.add(3);
        ints.add(2);
        ints.add(7);

        for (Integer num : ints) {
            System.out.println(num);
        }
        System.out.println();

        Collections.sort(ints);

        for (Integer num : ints) {
            System.out.println(num);
        }
        System.out.println();

        ArrayList<LocalDateTime> localDateTimes = new ArrayList<>();
        localDateTimes.add(LocalDateTime.parse("2021-01-02T13:11:51.141"));
        localDateTimes.add(LocalDateTime.parse("2021-01-01T13:11:51.141"));
        localDateTimes.add(LocalDateTime.parse("2021-01-04T13:11:51.141"));
        localDateTimes.add(LocalDateTime.parse("2021-01-03T13:11:51.141"));
        localDateTimes.add(LocalDateTime.parse("2021-01-05T13:11:51.141"));

        for (LocalDateTime localDateTime : localDateTimes) {
            System.out.println(localDateTime);
        }
        System.out.println();

        Collections.sort(localDateTimes);

        for (LocalDateTime localDateTime : localDateTimes) {
            System.out.println(localDateTime);
        }
        System.out.println();
    }
}

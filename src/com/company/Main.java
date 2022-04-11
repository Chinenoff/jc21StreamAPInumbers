package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> tempList = new ArrayList<>();

        for (Integer num : intList
        ) {
            if (num > 0 && num % 2 == 0) tempList.add(num);
        }
        Collections.sort(tempList);

        //print
        for (Integer x : tempList
        ) {
            System.out.println(x);
        }
    }
}

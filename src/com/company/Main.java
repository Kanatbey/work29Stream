package com.company;

import java.util.*;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

import static java.util.stream.Stream.*;

public class Main {

    public static void main(String[] args) {
        OptionalInt array = Arrays.stream(new Random().ints(10, 1, 19)
                .filter(x -> x % 2 == 0)
                .peek(x -> System.out.print(x * x + "  "))
                .toArray()).max();
        int max1 = array.getAsInt();
        System.out.println("\nMaximum values of even numbers is : " + max1 * max1);
    }

}
//    Integer массивден жуп сандарды терип алынызда алардын квадраттарынын эн чонун табыныз.
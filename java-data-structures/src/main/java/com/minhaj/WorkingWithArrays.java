package com.minhaj;

import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {
        String[] colors = new String[5]; //Declare an Array which data type is String
        colors[0] = "Purple";
        colors[1] = "blue";

        System.out.println(Arrays.toString(colors)); //first way to print

        //second way  to print
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);

        colors[2] = "Yellow";
        System.out.println(Arrays.toString(colors));

        int[] numbers = { 100, 200}; //Second way to array declared which type is integer

        //for know the length of any type of array we use 'array_name.length;
        System.out.println("==> "+colors.length);

        //Third way to print
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        //Forth way to print
        for (int i = colors.length -1 ; i >=0 ; i--) {
            System.out.println(colors[i]);
        }

        //Fifth way to print
        for (String color : colors) {
            System.out.println(color);
        }

        //Sixth way to print by stream
        Arrays.stream(colors).forEach(System.out::println);

        //You can use 'java.util.Arrays" class for various work like
        //Arrays.binarySearch() for binarySearch
        //Arrays.compare() for compare

    }
}
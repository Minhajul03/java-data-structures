package com.minhaj;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithList {
    public static void main(String[] args) {

        List unModifiableStringList = List.of(
                "Yellow",
                "Green"
        );
        //you can't add new element in unMutableStringList like -
        try {
            unModifiableStringList.add("White");
        } catch(Exception exception){
            System.err.println(exception);
        }

        //in list we can add anything like - string, integer, objects
        List randomList = new ArrayList();
        randomList.add("Blue");
        randomList.add("purple");
        randomList.add(1);
        randomList.add(new  Object());

        //only add strings
        List<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("purple");
        colors.add("Yellow");

        System.out.println(colors.size()); //print the size of list

        System.out.println(colors.contains("YEllow"));//print true or false
        System.out.println(colors.contains("Pink"));

        System.out.println(colors);//print all the list elements

        //second way to print list
        for(String color : colors){
            System.out.println(color);
        }

        //third way to print list
        colors.forEach(System.out::println);

        //forth way to print list
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }

}

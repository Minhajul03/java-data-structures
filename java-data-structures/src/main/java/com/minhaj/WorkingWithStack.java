package com.minhaj;

import java.util.Stack;

public class WorkingWithStack {
    public static void main(String[] args) {
        // stack represents LIFO method
        Stack<Integer> numbers= new Stack<>();

        numbers.push(3);
        numbers.push(16);
        numbers.push(0);

        System.out.println(numbers.peek()); //print the lastly inserted element in the stack

        System.out.println(numbers.size()); //Print the size of the stack

        System.out.println(numbers.pop()); //remove the lastly inserted element
        System.out.println(numbers.size());

        System.out.println(numbers.empty()); //to test whether the stack is empty
    }
}

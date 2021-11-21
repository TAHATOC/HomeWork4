package org.project;

import java.util.Arrays;

public class ReverseString {
    public static void main (String[] args) {
        String[] array = new String[] {"One", "Two", "Three", "Four", "Five"};
        System.out.println( "Original Sequence: " );
        System.out.println(Arrays.toString(array));
        System.out.println( "Reverse Sequence: " );
        StringBuilder reversed = new StringBuilder();
        for (int i = array.length; i > 0; i--) {
            reversed.append(array[i - 1]).append(" ");
        }
        String[] reversedArray = reversed.toString().split(" ");
        System.out.println(Arrays.toString(reversedArray));
    }
}

package org.project;

public class ReverseInt {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};
        System.out.println("Original Array: ");
        for(int i=0;i<intArray.length;i++)
            System.out.print(intArray[i] + "  ");
        System.out.println();
        System.out.println("Reverse Array: ");
        for(int i=intArray.length-1;i>=0;i--)
            System.out.print(intArray[i] + "  ");
    }
}

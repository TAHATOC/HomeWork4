package org.project;

import java.util.Scanner;

public class MinArray {
    public static void main(String args[])
    {
        int sml, size, i;
        int numArr[] = new int[50];
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the quantity of the array : ");
        size = scan.nextInt();
        System.out.print("Enter array elements : ");
        for(i=0; i<size; i++){
            numArr[i] = scan.nextInt();
        }
        System.out.print("Searching for the Smallest Element....\n\n");
        sml = numArr[0];
        for(i=0; i<size; i++){
            if(sml > numArr[i]){
                sml = numArr[i];
            }
        }
        System.out.print("Smallest Element is: " + sml);
    }
}

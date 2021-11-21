package org.project;

public class FindDublicate {

    public static void main(String[] args) {
        System.out.println("Next elements have a dublicate: ");
            int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
            for(int i = 0; i < arr.length; i++) {
                for(int j = i + 1; j < arr.length; j++) {
                    if(arr[i] == arr[j])
                        System.out.println(arr[j]);
                }
            }
        }

}


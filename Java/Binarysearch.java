/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

import java.util.Scanner;

public class Binarysearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size :");
        int size = input.nextInt();
        int array[]=new int [size];
        
        for(i=0;i<size;i++)
        {
            System.out.println("Enter the %d for the array :");
            array[i]=input.nextInt();
        }
        System.out.println("Enter the Element you want to find :");
        int key = input.nextInt();
       BinarySearchClass n1 = new BinarySearchClass();
       int pass = input.BinarySearchClass(size,key,array[]);
        
}

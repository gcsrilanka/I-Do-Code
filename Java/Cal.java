/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cal;

import java.util.Scanner;

public class Cal {

    public static void main(String[] args) {
        Scanner ca = new Scanner(System.in);
        int a,b;
        System.out.println("Enter Your First number :");
        a=ca.nextInt();
        System.out.println("Enter Your Second number :");
        b=ca.nextInt();
        Calculator c1 = new Calculator();
        int ans1 = c1.addition(a,b);
        int ans2 =c1.substraction(a,b);
        int ans3 =c1.multiplication(a,b);
        int ans4 =c1.division(a,b);
        System.out.println("Addition of two number is :" +ans1);
        System.out.println("substraction of two number is :" +ans2);
        System.out.println("multiplication of two number is :" +ans3);
        System.out.println("division of two number is :" +ans4);
       

        
    }
    
}

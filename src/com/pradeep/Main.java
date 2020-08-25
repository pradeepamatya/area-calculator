package com.pradeep;


import java.util.Scanner;

public class Area_Calculator {
    public static void main (String[ ] args ){

        System.out.println("It is a simple calculator program where you can calculate Area of a Circle .");

        double pi = Math.PI;
        double Inra = 0;

        System.out.println("Please Enter the Radius of the Circle .");

        Scanner Input = new Scanner(System.in);

        Inra = Input.nextDouble();

        double rs = Math.pow(Inra,2) ;

        double prs = pi * rs;

        System.out.println("The Radius of the Circle is " + Inra + ".");
        System.out.println("The Area of the Circle is " + prs + "." );


    }
}
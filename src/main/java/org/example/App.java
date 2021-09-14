package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Cody Kalczuk
 */

public class App
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int amount;
        double tAmount = 0.0, tax = 0.0;
        System.out.print("What is order amount? ");
        amount = sc.nextInt();
        System.out.print("What state do you live in? ");
        String state = sc.next();

        if(state.equals("Wisconsin"))
        {
            System.out.print("What county do you live in? ");
            String county = sc.next();

            if(county.equals("Eau Claire")){
                tax = (amount*5.005)/100;
                tAmount = tax + amount;
            }
            else if(county.equals("Dunn")){
                tax = (amount*5.004)/100;
                tAmount = tax + amount;
            }
            else{
                tax = (amount*5.000)/100;
                tAmount = tax + amount;
            }
        }
        else if(state.equals("Illinois")){
            tax = (amount*8)/100;
            tAmount = tax + amount;
        }
        else{
            tax = 0.0;
            tAmount = amount;
        }
        System.out.println("The tax is  $"+String.format("%.2f",tax));
        System.out.println("The total is  $"+String.format("%.2f",tAmount));
    }
}
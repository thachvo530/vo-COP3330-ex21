/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Thach Vo
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the number of the month: ");
        int monthnum = scan.nextInt();
        String month = "";

        switch (monthnum) {

            case 1:
                month = "January";
                break;

            case 2:
                month = "Feburary";
                break;

            case 3:
                month = "March";
                break;

            case 4:
                month = "April";
                break;

            case 5:
                month = "May";
                break;

            case 6:
                month = "June";
                break;

            case 7:
                month = "July";
                break;

            case 8:
                month = "August";
                break;

            case 9:
                month = "September";
                break;

            case 10:
                month = "October";
                break;

            case 11:
                month = "November";
                break;

            case 12:
                month = "December";
                break;

        }

        System.out.print("The name of the month is "+month+".");

    }

}

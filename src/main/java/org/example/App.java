/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Sarim Jatt
 */
package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        String noun, verb, adjective, adverb;
        System.out.print("Enter a noun: ");
        noun = in.nextLine();
        System.out.print("Enter a verb: ");
        verb = in.nextLine();
        System.out.print("Enter an adjective: ");
        adjective = in.nextLine();
        System.out.print("Enter an adverb: ");
        adverb = in.nextLine();

        String s = String.format("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb);
        System.out.println(s);
        
        in.close();
    }
}
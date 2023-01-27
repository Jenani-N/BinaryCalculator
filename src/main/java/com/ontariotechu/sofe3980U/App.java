package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
	/**
	* Main program:  The entry point of the program. The local time will be printed first,
	*      Then it will create two binary variables, add them and print the result.
	*
	* @param args: not used
	*/
    public static void main( String[] args )
    {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the First Binary Number:");
		Binary num1= new Binary(sc.nextLine());
		System.out.println("Enter the First Binary Number:");
		Binary num2= new Binary(sc.nextLine());


		Binary or= Binary.OR(num1,num2);
		System.out.println( "Their Bitwise OR is "+or.getValue());

		Binary and= Binary.AND(num1,num2);
		System.out.println( "Their Bitwise AND is "+and.getValue());

		Binary mul= Binary.MUL(num1,num2);
		System.out.println( "Their Product is "+mul.getValue());
    }
}
/*
Problem is that when one binary number is longer than the other, it just fills that space with 1's even when they're zero's
need to check when only one binary num still has some digits left and just append those onto the result
 */
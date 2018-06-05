package main.java;

import java.util.Scanner;

public class Discriminant {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b, c, D;

		System.out.println("Program for main.java.Discriminant: Please fill the data !");
		// TODO Make another method for entering new values
		System.out.println("Type а: ");
		a = in.nextInt();
		System.out.println("Type b: ");
		b = in.nextInt();
		System.out.println("Type c: ");
		c = in.nextInt();
		in.close();
		
		D=(b*b)-(4*a*c);

		// TODO can't be less then 0
		if(D >= 0){ 
			System.out.println ("main.java.Discriminant = " + D);
		}
		else{
			System.out.println("Error: main.java.Discriminant can't be less then 0");
		}
	}
}

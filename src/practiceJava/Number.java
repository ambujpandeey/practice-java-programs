package practiceJava;

import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal : ");
		long p = sc.nextLong();
		System.out.println("Enter rate : ");
		long r = sc.nextLong();
		System.out.println("Enter time : ");
		long t = sc.nextLong();

		long si = (p * r * t) / 100;
		System.out.println("Simple Intereste is : " + si);
				
		/*
		 * double si = getSI(p, r, t);
		 * 
		 * System.out.println("Simple Interest is : " + si); }
		 * 
		 * private static double getSI(long p, long r, long t) {
		 * 
		 * double si = (p * r * t) / 100; return si; }
		 */
	
	}
}


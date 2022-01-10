package com.mahendra.strings;

import java.util.Scanner;

public class Palindrome {
	static void palindromecheck(String input) {
		String reverse="";
		for(int i=input.length()-1;i>=0;i--) {
			reverse+=input.charAt(i);
		}
		if(reverse.equalsIgnoreCase(input))System.out.println("it is a palindrome");
		else System.out.println("it is not a palindrome");
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		sc.close();
		palindromecheck(s);
	}
}

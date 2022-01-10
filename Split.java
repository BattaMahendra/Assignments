package com.mahendra.strings;

import java.util.Scanner;
public class Split {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter");
		String string1 = sc.nextLine();
		String string2 = sc.nextLine();
		int length = string1.length();
		char []array = new char[length];
		for(int i = 0; i < length; i++) {
			if(string1.substring(i) == string2) {
				string1.replace(string1.toString(), " ");
				System.out.println();
			}
			else {
				array[i] = string1.charAt(i);
			}
		}
		for(char i : array) {
			System.out.print(i);
		}
		sc.close();
	}
}
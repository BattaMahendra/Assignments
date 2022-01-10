package test;

import java.util.Scanner;

public class SplitCustomized {
static String[] myOwnSplit(String original, String splitting) {
	int len=original.length();
	int count=0;
	for(int i=0;i<len;i++) {
		if(original.charAt(i)==splitting.charAt(0)) {
			count++;
		}
	}
	String[] splittedStrings=new String[count];
	int j=0,temp=0;
	for(int i=0;i<len;i++) {
		if(original.charAt(i)==splitting.charAt(0)) {
			splittedStrings[j++]=original.substring(temp,i);
			 temp=i+1;
		}
	}
	if(temp==0)System.out.println("there is no matching of the string you entered");
	else System.out.println("after splitting thr string ");
	return splittedStrings;
}
public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	System.out.println("enter the original string");
	String originalInput=input.nextLine();
	System.out.println("enter the splittable character");
	String splittableInput=input.nextLine();
	input.close();
	String[] strings=myOwnSplit(originalInput, splittableInput);
	
	for(String s:strings) {
		System.out.println(s);
	}
	
}
}

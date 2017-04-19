package com.org_name.mainpkg;

public class Main_Class {

	public static void main(String[] args) {
		System.out.println("hello");
		
		int c, d = 5;
		
		float e = 1f;
		
		
		String str = "a";
		
		str.length();
		System.out.println(d);
		
		int totalMarks = 600;
		double marksObtained = 522;
		
		
		
		System.out.println(marksObtained*100/totalMarks);
		
		String firstName = "Surya";
		String lastName = "K";
		
		System.out.println("Hello " + lastName + ", " + firstName);
		System.out.println("Hello ".concat(lastName).concat(", ").concat(firstName));
		
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "hello";
		
		if (s1 == s2){
		System.out.println("Equal");
		}
		
		if (s1 == s3){
			System.out.println("Equal");
		}
		
		}
}

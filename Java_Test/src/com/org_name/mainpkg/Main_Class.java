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
		System.out.println("Equal1");
		}
		
		if (s1 == s3){
			System.out.println("Equal2");
		}
		
		if (s1.equals(s2)){
			System.out.println("Equal3");
			}
		
		if (s1.equalsIgnoreCase(s3)){
			System.out.println("Equal4");
			}
		
		
		String s4 = new String("Hello");
		String s5 = new String("Hello");
		
		if (s4 == s5){
			System.out.println("Equal5");
			}
		

		if (s4.equals(s5)){
			System.out.println("Equal6");
			}
		if (s4.equals(s1)){
			System.out.println("Equal7");
			}
		
		if (s4 == s1){
			System.out.println("Equal8");
			}
		String sentence = "How are you";
		
		String findChar = "ow";
		
		int index = sentence.indexOf(findChar);
		
		
		System.out.println("Index Value " + index);
		
		if (index != -1){
			System.out.println("Found");
		}
		
		else {
			System.out.println("Not Found");
		}
		
		
		String result = index == -1? "Found":"Not Found";
		
		System.out.println(result);
		
		
		
		}
}

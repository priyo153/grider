package grider;

import java.util.regex.Pattern;

public class Vowels {
	
	public static int vowels(String s) {
		
		s=s.replaceAll("[^aeiouAEIOU]", "");
		return s.length();
	}
	
	public static void main(String[] args) {
		System.out.println(vowels("aeioupUSSAY"));

	}

}

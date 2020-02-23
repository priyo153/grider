package grider;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;

public class Anagram {

	public static boolean anagram(String s1, String s2) {

		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		Map<Character, Integer> lettermap1 = new HashMap<>();
		Map<Character, Integer> lettermap2 = new HashMap<>();

		for (int i = 0; i < s1.length(); i++) {

			if (lettermap1.containsKey(s1.charAt(i))) {
				lettermap1.put(s1.charAt(i), lettermap1.get(s1.charAt(i)) + 1);
			} else {

				lettermap1.put(s1.charAt(i), 1);
			}

		}

		for (int i = 0; i < s2.length(); i++) {

			if (lettermap2.containsKey(s2.charAt(i))) {
				lettermap2.put(s2.charAt(i), lettermap2.get(s2.charAt(i)) + 1);
			} else {

				lettermap2.put(s2.charAt(i), 1);
			}

		}

		for (Entry<Character, Integer> e : lettermap1.entrySet()) {

			if (Pattern.matches("[a-z]", Character.toString(e.getKey())) && (!lettermap2.containsKey(e.getKey())
					|| (lettermap2.containsKey(e.getKey()) && lettermap2.get(e.getKey()) != e.getValue()))) {
				return false;
			}
		}

		return true;

	}

	public static void main(String[] args) {
		System.out.println(anagram("aaabbbbb", "AAAbbbbB!"));

	}

}

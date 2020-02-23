package grider;

public class Capitalize {

	public static String capitalize(String s) {

		StringBuffer sb = new StringBuffer(Character.toString(s.charAt(0)).toUpperCase());

		for (int i = 0; i < s.length() - 1; i++) {

			if (s.charAt(i) == ' ') {
				sb.append(Character.toString(s.charAt(i + 1)).toUpperCase());

			} else {
				sb.append(Character.toString(s.charAt(i + 1)));
			}

		}

		return sb.toString();

	}

	public static void main(String[] args) {
		System.out.println(capitalize("today is your lucky day"));

	}

}

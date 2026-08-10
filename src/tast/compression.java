package tast;

import java.util.Scanner;

public class compression {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		StringBuilder result = new StringBuilder();
		int i = 0;
		while (i < s.length()) {
			char ch = s.charAt(i);
			int counter = 0;
			while (i < s.length() && s.charAt(i) == ch) {
				i++;
				counter++;
			}
			if (counter > 9) {
				result.append(ch);
				result.append(9);
				counter-=9;
			}
			if (counter == 1) {
				result.append(ch);
			}
			else {
				result.append(ch);
				result.append(counter);
			}
		}
		if (result.length() == s.length()) {
			System.out.print(s);
		}
		else {
			System.out.print(result);
		}
	}

}

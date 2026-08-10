package tast;

import java.util.Scanner;

public class compression2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String s=scanner.next();
		StringBuilder a=new StringBuilder();
		int i=0;
		while(i<s.length()) {
			char ch=s.charAt(i);
			int counter=0;
			while(i<s.length()&&s.charAt(i)==ch) {
				i++;
				counter++;
			}
			if(counter>9) {
				a.append(ch);
				a.append(9);
				counter-=9;
			}
			if(counter==1) {
				a.append(ch);
			}
			else {
				a.append(ch);
				a.append(counter);
			}
		}
		if(a.length()==s.length()) {
			System.out.print(s);
		}
		else {
			System.out.print(a);
		}
	}

}

package tast;

import java.util.Scanner;

public class decompression_code {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String s=scanner.next();
		
		for(int i=0;i<s.length();i++) {
			int counter=0;
			if(i+1<s.length()&&Character.isDigit(s.charAt(i+1))) {
				counter=s.charAt(i+1)-'0';
				
			}
			else if(!Character.isDigit(s.charAt(i))) {
				System.out.print(s.charAt(i));
			}
			for(int j=0;j<counter;j++) {
				System.out.print(s.charAt(i));
			}
			
		}

	}

}

package tast;

import java.util.Scanner;

public class multiple_rules {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int m=scanner.nextInt();
		int n=scanner.nextInt();
		StringBuilder Rule=new StringBuilder(scanner.next()).reverse();
		StringBuilder Word=new StringBuilder(scanner.next());
		for(int i=0;i<m;i++) {
			if(Rule.charAt(i)=='R') {
				Word.reverse();
			}
			else if(Rule.charAt(i)=='L') {
				Word.insert(0,Word.charAt(n-1));
				Word.deleteCharAt(n);
			}
			else if(Rule.charAt(i)=='S'){
				if(n%2==0) {
					int x=n/2;
					Word.append(Word.substring(0,x));
					Word.delete(0,x);
				}
				else {
					int x=n/2;
					String Front=Word.substring(0,x).toString();
					Word.replace(0,x,Word.substring(x+1, n));
					Word.delete(x+1, n);
					Word.append(Front);
					//ADCAEB EBDCA ADCA
				}
			}
			
		}
		System.out.print(Word);
				

	}

}

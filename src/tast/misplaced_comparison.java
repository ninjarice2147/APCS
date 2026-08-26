package tast;

import java.util.Scanner;

public class misplaced_comparison {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String a=scanner.next();
		String b=scanner.next();
		
		//計算
		if(	Math.abs(a.length()-b.length())>1) {
			System.out.print("NO");
		}
		else {
			int counter=0;
			int max=Math.max(a.length(),b.length());
			for(int i=0;i<max;i++) {
				if(a.charAt(i)!=b.charAt(i)) {
					
				}
				
			}
		}

	}

}

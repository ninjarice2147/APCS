package tast;

import java.util.Scanner;

public class mirror {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int k=scanner.nextInt();
		String line=scanner.next();
		StringBuilder ans=new StringBuilder();
		for(int i=0;i<n;i+=k) {
			int end=Math.min(i+k,n);
			
			for(int j=end-1;j>=i;j--) {
				ans.append(line.charAt(j));
			}
		}
		System.out.print(ans);
		
		

	}

}

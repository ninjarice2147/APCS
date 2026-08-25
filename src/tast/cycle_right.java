package tast;

import java.util.Scanner;

public class cycle_right {

	public static void main(String[] args) {
		//輸入
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int q=scanner.nextInt();
		StringBuilder line=new StringBuilder(scanner.next());
		//計算
		for(int i=0;i<q;i++) {
			int f=scanner.nextInt();
			for(int j=0;j<f;j++) {
				line.insert(0,line.charAt(n-1));
				line.deleteCharAt(n);
			}
		}
		System.out.print(line);
		
		

	}

}

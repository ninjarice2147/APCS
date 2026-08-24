package tast;

import java.util.Scanner;

public class letter_energy {

	public static void main(String[] args) {
		//輸入
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int q=scanner.nextInt();
		String s=scanner.next();
		//計算
		for(int i=0;i<q;i++) {
			int start=scanner.nextInt();
			int end=scanner.nextInt();
			int result=0;
			for(int j=start;j<=end;j++) {
				char ch=Character.toUpperCase(s.charAt(j));
				int number=ch-'A'+1;
				result+=number;
			}
			System.out.println(result);
		}
		
		
		
	}

}

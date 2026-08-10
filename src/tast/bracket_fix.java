package tast;

import java.util.Scanner;

public class bracket_fix {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String line=scanner.next();
		//char[] brackets=new char[line.length()];
		int leftB=0;
		int hm=0;
		for(int i=0;i<line.length();i++) {
			//如果是右邊
			if(line.charAt(i)==')') {
				 //之前有左邊
				if(leftB>0) {
					leftB--;
				}
				//沒有 多右邊
				else {
					hm++;
				}
			}
			//如果是左邊
			if(line.charAt(i)=='(') {
				leftB++;
				
			}
		}
		hm+=leftB;
		System.out.print(hm);
		
	}

}

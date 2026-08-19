package tast;

import java.util.Scanner;

public class longest_segment {
	//明天建構子
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String line=scanner.next();
		int max=1;
		char[] last= {'\0','\0'};
		int counter=0;
		for(int i=0;i<line.length();i++) {
			if(line.charAt(i)==last[0]||line.charAt(i)==last[1]) {
				
			}
			else {
				max=1;
				if(counter==0||last[1]=='\0') {
					last[1]=line.charAt(i);
				}
				else {
					last[0]=line.charAt(i);
				}
			}
		}

	}

}

package tast;

import java.util.Scanner;

public class longest_segment {
	//明天建構子
	public static class last{
		char word;
		int f;
		public last(char word,int f) {
			this.word=word;
			this.f=f;
			
		}
		
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String line=scanner.next();
		last[] l=new last[2];
		l[0]=new last('\0', 1);
		l[1]=new last('\0', 1);
		int counter=0;
		int max=0;
		for(int i=0;i<line.length();i++) {
			if(line.charAt(i)==l[0].word||line.charAt(i)==l[1].word) {
				l[counter].f++;
			}
			else {
				if(counter==0) {
					l[1].word=line.charAt(i);
					l[1].f=1;
					counter=1;
				}
				else {
					l[0].word=line.charAt(i);
					l[0].f=1;
					counter=0;
				}
			}
			if(l[0].f+l[1].f>max) {
				max=l[0].f+l[1].f;
			}
		}
		
		System.out.print(max);
	}

}

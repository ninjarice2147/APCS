package tast;

import java.util.Scanner;

public class adjacent_bomb {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int k=scanner.nextInt();
		String OLine=scanner.next();
		StringBuilder line=new StringBuilder();
		line.append(OLine);
		
		int counter=0;
		int start=0;
		//會沒數完
		for(int i=0;i<line.length();i++){
			if(line.charAt(i)==line.charAt(Math.max(i-1,0))&&i!=0){
				 counter++;
			}
			else {
				counter=1;
				start=i;
			}
			
			if(counter==k) {
				line.delete(start, i+1);
				i=-1;
				counter=0;
			}
			
			
		}
		if(line.isEmpty()) {
			System.out.print("EMPTY");
		}
		else {
			System.out.print(line);
		}
	}

}

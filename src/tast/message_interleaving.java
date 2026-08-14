package tast;

import java.util.Scanner;

public class message_interleaving {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String ow=scanner.next();
		StringBuilder w=new StringBuilder();
		//偶數數量
		int even;
		if(ow.length()%2==0) {
			 even=ow.length()/2;
		}
		else {
			 even=(ow.length()/2)+1;
		}
		//計算
		for(int i=0;i<ow.length();i++) {
			
			if(i<even) {
				w.append(ow.charAt(i));
			}
			else {
				int odd=(i-even)+1;
				w.insert((odd*2)-1,ow.charAt(i));
			}
			
		}
		
		System.out.print(w);
		
	}

}

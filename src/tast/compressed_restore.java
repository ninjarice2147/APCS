package tast;

import java.util.Scanner;

public class compressed_restore {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String ling=scanner.next();
		int counter=0;
		int ht=0;
		String lw="";
		String f="";
		for(int i=0;i<ling.length();i++) {
			if(Character.isDigit(ling.charAt(i))) {
				lw=lw+ling.charAt(i);
				counter++;
			}
			else if(counter>0){
				for(int j=0;j<Integer.parseInt(lw);j++) {
					f=f+ling.charAt(i);
				}
				ht+=Integer.parseInt(lw);
				lw="";
				counter=0;
			}
			else {
				f=f+ling.charAt(i);
				ht++;
			}
		}
		System.out.println(ht);
		System.out.print(f);
	}

}

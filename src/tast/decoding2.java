package tast;

import java.util.Scanner;

public class decoding2 {
	static String halfswitch(String s) {
		int mid =s.length()/2;
				if(s.length()%2==0) {
			return s.substring(mid)+s.subSequence(0, mid);
		}
		return s.substring(mid+1)+s.charAt(mid)+s.substring(0,mid);
	}
	static String decode(String e,String s) {
		StringBuilder a =new StringBuilder();
		int count=0;
		for(int i=s.length()-1;i>=0;i--) {
			char ch_e=e.charAt(i);
			if(ch_e=='0') {
				a.insert(0, s.charAt(i));
			}
			else {
				a.append(s.charAt(i));
				count++;
			}
		}
		if(count%2==1) {
			return halfswitch(a.toString());
		}
		return a.toString();
	}

	public static void main(String[] args) {
		//輸入
		Scanner scanner=new Scanner(System.in);
		int m =scanner.nextInt(); //e的數量
		int n=scanner.nextInt();//e s的長度
		String[] e=new String[m];
		for(int i=0;i<m;i++) {
			e[i]=scanner.next();
		}
		String s=scanner.next();
		for(int i=m-1;i>=0;i--) {
			s=decode(e[i],s);
		}
		System.out.print(s);
	}

}

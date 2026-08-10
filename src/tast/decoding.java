package tast;

import java.util.Scanner;

public class decoding {
	//對半交換
	static String swapHalf(String s) {
		int n=s.length();
		int mid=n/2;
		if(n%2==0) {
			return s.substring(mid)+s.substring(0,mid);
		}
		return s.substring(mid+1)+s.charAt(mid)+s.substring(0,mid);
	}
	//解碼
	static String decode(String t,String e) {
		//逆解原碼
		StringBuilder s=new StringBuilder();
		for(int i=e.length()-1;i>=0;i--) {
			char ch=t.charAt(i);
			if(e.charAt(i)=='0') {
				s.insert(0, ch);
			}
			else {
				s.append(ch);
			}
		}
		//解對半
		int onecount=0;
		for(int i=0;i<e.length();i++) {
			if(e.charAt(i)=='1') {
				onecount++;			}
		}
		if(onecount%2==1) {
			return swapHalf(s.toString());
		}
		return s.toString();
	}
	public static void main(String[] args) {
		//輸入
		Scanner scanner=new Scanner(System.in);
		int m=scanner.nextInt();
		int n=scanner.nextInt();
		String[] e=new String[m];
		for(int i =0;i<m;i++) {
			e[i]=scanner.next();
		}
		String result=scanner.next();
		for(int i=m-1;i>=0;i--) {
			result=decode(result,e[i]);
		}
		System.out.print(result);
	}

}

package tast;

import java.util.Arrays;
import java.util.Scanner;

public class classrank3 {
	public static class s {
		String name;
		int point;
		public s(String name,int point) {
			this.name=name;
			this.point=point;
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		s[] s=new s[n];
		for(int i =0;i<n;i++) {
			String name=scanner.next();
			int point=scanner.nextInt();
			s[i]=new s(name,point);
		}
		Arrays.sort(s,(a,b)->{
			if(a.point!=b.point) {
				return Integer.compare(b.point, a.point);
			}
			return a.name.compareTo(b.name);
		});
		for(int i=0;i<n;i++) {
			System.out.println(s[i].name+" "+s[i].point);
		}
	}

}

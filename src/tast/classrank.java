package tast;

import java.util.Arrays;
import java.util.Scanner;

public class classrank {
	
	public static class st {
		String name;
		int score;

		st(String name, int score) {
			this.name = name;
			this.score = score;
		}
	}

	public static void main(String[] args) {
		//收總量
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		st[] st = new st[n];
		//收數字&放進陣列
		for (int i = 0; i < n; i++) {
			String name = scanner.next();
			int score = scanner.nextInt();
			st[i] = new st(name, score);
		}
		Arrays.sort(st,(a,b)->{
			if(a.score!=b.score) {
				return Integer.compare(b.score, a.score);
			}
			return a.name.compareTo(b.name);
		});
		
		
	}

}

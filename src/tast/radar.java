package tast;

import java.util.Scanner;

public class radar {

	public static void main(String[] args) {
		// 輸入
		Scanner scanner = new Scanner(System.in);
		int oy = scanner.nextInt();
		int ox = scanner.nextInt();
		int[][] map = new int[oy][ox];
		for (int i = 0; i < oy; i++) {
			for (int j = 0; j < ox; j++) {
				map[i][j] = scanner.nextInt();
			}
		}
		// 計算
		int radar=0;
		for (int i = 0; i < oy; i++) {
			for (int j = 0; j < ox; j++) {
				int h=map[i][j];
				int counter=0;
				for(int p=0;p<oy;p++) {
					for(int l=0;l<ox;l++) {
						if((Math.abs(i-p)+Math.abs(j-l))<=h) {
							counter+=h;
						}
					}
				}
				if(counter%7==0) {
					radar++;
				}
				
			}
		}
		System.out.print(radar);
	}

}

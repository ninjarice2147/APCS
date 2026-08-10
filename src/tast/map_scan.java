package tast;

import java.util.Scanner;

public class map_scan {

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
		int b=0;
		for (int i = 0; i < oy; i++) {
			for (int j = 0; j < ox; j++) {
				int yc=0;
				int xc=0;
				if(map[i][j]==1) {
					for(int p=0;p<oy;p++) {
						if(map[p][j]==1) {
							yc++;
						}
					}
					
					for(int p=0;p<ox;p++) {
						if(map[i][p]==1) {
							xc++;
						}
					}
					if(yc==xc) {
						b++;
					}
				}
				
			}
		}
		System.out.print(b);
	}

}

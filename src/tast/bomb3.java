package tast;

import java.util.Scanner;

public class bomb3 {

	public static void main(String[] args) {
		// 輸入
		Scanner scanner = new Scanner(System.in);
		int oy = scanner.nextInt();
		int ox = scanner.nextInt();
		char[][] map = new char[oy][ox];
		for (int i = 0; i < oy; i++) {
			String line=scanner.next();
			for (int j = 0; j < ox; j++) {
				map[i][j] = line.charAt(j);
			}

		}
		// 方向
		int[] dy = { -1, -1, -1, 0, 0, 1, 1, 1 };
		int[] dx = { -1, 0, 1, -1, 1, -1, 0, 1 };
		// 計算
		for (int i = 0; i < oy; i++) {
			for (int j = 0; j < ox; j++) {
				int counter = 0;
				if (map[i][j] == '*') {
					System.out.print('*');
				} 
				else {
					for (int k = 0; k < 8; k++) {
						if (i + dy[k] >= 0 && i + dy[k] < oy && j + dx[k] >= 0 && j + dx[k] < ox) {
							if (map[i+dy[k]][j+dx[k]] == '*') {
								counter++;
							}
						}

					}
					System.out.print(counter);
				}

			}
			System.out.println();
		}

	}

}

package tast;

import java.util.Scanner;

public class bomb_spread {

	public static void main(String[] args) {
		// 輸入
		Scanner scanner = new Scanner(System.in);
		int oy = scanner.nextInt();
		int ox = scanner.nextInt();
		int n = scanner.nextInt();
		int[][] map = new int[oy][ox];
		for (int i = 0; i < oy; i++) {
			for (int j = 0; j < ox; j++) {
				map[i][j] = scanner.nextInt();
			}
		}
		// 方向
		int[] dy = { -1, -1, -1, 0, 0, 1, 1, 1 };
		int[] dx = { -1, 0, 1, -1, 1, -1, 0, 1 };
		// 計算
		while (n > 0) {
			// 炸彈擴散
			for (int i = 0; i < oy; i++) {
				for (int j = 0; j < ox; j++) {
					int d = 0;
					if (map[i][j] == 1) {
						for (int p = 0; p < 8; p++) {
							if (i + dy[d] >= 0 && i + dy[d] < oy && j + dx[d] >= 0 && j + dx[d] < ox) {
								if(map[i + dy[d]][j + dx[d]]!=1) {
									map[i + dy[d]][j + dx[d]] = -1;
								}
							}
							d++;
						}
					}

				}

			}
			// 上回合炸彈啟動
						for (int i = 0; i < oy; i++) {
							for (int j = 0; j < ox; j++) {
								if (map[i][j] == -1) {
									map[i][j] =1;
								}
							}
						}
			n--;
		}
		int quantity = 0;
		for (int i = 0; i < oy; i++) {
			for (int j = 0; j < ox; j++) {
				if (map[i][j] == 1) {
					quantity++;
				}
			}
		}
		System.out.print(quantity);

	}

}

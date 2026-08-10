package tast;

import java.util.ArrayDeque;
import java.util.Scanner;

public class drain_outlet {

	public static class listWalked {
		int y;
		int x;

		listWalked(int y, int x) {
			this.y = y;
			this.x = x;

		}
	}

	public static void main(String[] args) {
		// 輸入
		Scanner scanner = new Scanner(System.in);
		int oy = scanner.nextInt();
		int ox = scanner.nextInt();
		String[] om = new String[oy];
		char[][] map = new char[oy][ox];
		int[][] dist = new int[oy][ox];
		ArrayDeque<listWalked> lw = new ArrayDeque<>();
		for (int i = 0; i < oy; i++) {
			om[i] = scanner.next();
		}
		// 加進地圖,讓地圖設置沒走過,設置排水口
		for (int i = 0; i < oy; i++) {
			for (int j = 0; j < ox; j++) {
				map[i][j] = om[i].charAt(j);
				dist[i][j] = -1;
				if (om[i].charAt(j) == 'W') {
					dist[i][j] = 0;
					lw.add(new listWalked(i, j));
				}
			}
		}
		// 方向
		int[] dy = { -1, 0, 1, 0 };
		int[] dx = { 0, 1, 0, -1 };
		// 計算
		while (!lw.isEmpty()) {
			listWalked nw = lw.poll();
			int y = nw.y;
			int x = nw.x;
			for (int d = 0; d < 4; d++) {
				if (y + dy[d] >= 0 && y + dy[d] < oy && x + dx[d] >= 0 && x + dx[d] < ox) {
					if (map[y + dy[d]][x + dx[d]] != '#' && dist[y + dy[d]][x + dx[d]] == -1) {
						dist[y + dy[d]][x + dx[d]] = dist[y][x] + 1;
						lw.add(new listWalked(y + dy[d], x + dx[d]));
					}
				}
			}
		}
		// 輸出計算
		int out=0;
		for (int i = 0; i < oy; i++) {
			for (int j = 0; j < ox; j++) {
				if(dist[i][j]!=-1) {
					out+=dist[i][j];
				}
			}
		}
		System.out.print(out);
	}

}

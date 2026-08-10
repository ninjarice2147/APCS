package tast;

import java.util.ArrayDeque;
import java.util.Scanner;

public class treasure_room {

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

		ArrayDeque<listWalked> lw = new ArrayDeque<>();
		boolean[][] visited = new boolean[oy][ox];

		for (int i = 0; i < oy; i++) {
			om[i] = scanner.next();
		}
		for (int i = 0; i < oy; i++) {
			for (int j = 0; j < ox; j++) {
				map[i][j] = om[i].charAt(j);
				visited[i][j]=false;
			}
		}
		// 方向
		int[] dy = { -1, 0, 1, 0 };
		int[] dx = { 0, 1, 0, -1 };
		// 計算
		int max=0;
		for (int i = 0; i < oy; i++) {
			for (int j = 0; j < ox; j++) {
				int counter=0;
				if(map[i][j]=='.'&&visited[i][j]!=true) {
					//擴散搜索
					lw.add(new listWalked(i, j));
					while(!lw.isEmpty()) {
						listWalked nw=lw.poll();
						int y=nw.y;
						int x=nw.x;
						for(int d=0;d<4;d++) {
							if(y+dy[d]>=0&&y+dy[d]<oy&&x+dx[d]>=0&&x+dx[d]<ox) {
								if(map[y+dy[d]][x+dx[d]]!='#'&&visited[y+dy[d]][x+dx[d]]!=true) {
									visited[y+dy[d]][x+dx[d]]=true;
									lw.add(new listWalked(y+dy[d],x+dx[d]));
									counter++;
								}
								
							}
							
						}
					}
				}
				if(counter>max) {
					max=counter;
				}
				
			}
		}
		System.out.print(max);
	}

}

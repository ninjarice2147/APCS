package tast;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Passable_slope {
	
	public static class lastWalked{
		int y;
		int x;
		lastWalked(int y,int x){
			this.y=y;
			this.x=x;
		}
		
	}

	public static void main(String[] args) {
		//輸入
		Scanner scanner = new Scanner(System.in);
		int oy = scanner.nextInt();
		int ox = scanner.nextInt();
		int D = scanner.nextInt();
		int[][] map=new int[oy][ox];
		Boolean[][] walked=new Boolean[oy][ox];
		for (int i = 0; i < oy; i++) {
			for (int j = 0; j < ox; j++) {
				map[i][j]=scanner.nextInt();
				walked[i][j]=false;
			}

		}
		//方向
		int[] dy= {-1,0,1,0};
		int[] dx= {0,1,0,-1};
		//計算
		ArrayDeque<lastWalked>lw=new ArrayDeque<>();
		lw.add(new lastWalked(0,0));
		int counter=0;
		while(!lw.isEmpty()) {
			lastWalked nw=lw.poll();
			int y=nw.y;
			int x=nw.x;
			for(int d=0;d<4;d++) {
				if(y+dy[d]<0||y+dy[d]>=oy||x+dx[d]<0||x+dx[d]>=ox) {
					continue;
				}
				if(Math.abs(map[y][x]-map[y+dy[d]][x+dx[d]])>D) {
					continue;
				}
				if(walked[y+dy[d]][x+dx[d]]!=false) {
					continue;
				}
				lw.add(new lastWalked(y+dy[d],x+dx[d]));
				walked[y+dy[d]][x+dx[d]]=true;
			}
			
			
		}
		if(walked[oy-1][ox-1]) {
			System.out.print("YES");
		}
		else {
			System.out.print("NO");
		}
		
		
	}

}

package tast;

import java.util.Scanner;

public class collect_gems {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//輸入
		int M=scanner.nextInt();
		int N=scanner.nextInt();
		int K=scanner.nextInt();
		int ly=scanner.nextInt();
		int lx=scanner.nextInt();
		int[][] map=new int[M][N];
		int gem=0;
		int point=0;
		int d=1;
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				map[i][j]=scanner.nextInt();
				
			}
			
		}
		//座標
		int[] dy= {-1,0,1,0};
		int[] dx= {0,1,0,-1};
		//計算
		while(map[ly][lx]!=0) {
			//吃分
			point+=map[ly][lx];
			gem++;
			map[ly][lx]--;
			//旋轉
			if(point%K==0) {
				d++;
				d=d%4;
			}
			
			while(true){
				int x=lx+dx[d];
				int y=ly+dy[d];
				boolean OutOfMap=x<0||x>=N||y<0||y>=M;
				boolean wall=!OutOfMap &&map[y][x]==-1;
				if(!OutOfMap&&!wall) {
					break;
				}
				d++;
				d=d%4;
			}
			//走路
			lx=lx+dx[d];
			ly=ly+dy[d];
		}
		System.out.print(gem);
	}

}

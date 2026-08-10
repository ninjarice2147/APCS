package tast;

import java.util.Scanner;

public class collect_gems2 {

	public static void main(String[] args) {
		//輸入
		Scanner scanner=new Scanner(System.in);
		int oy=scanner.nextInt();
		int ox=scanner.nextInt();
		int K=scanner.nextInt();
		int ly=scanner.nextInt();
		int lx=scanner.nextInt();
		int gem =0;
		int point=0;
		int[][] map=new int[oy][ox];
		for(int i=0;i<oy;i++) {
			for(int j=0;j<ox;j++) {
				map[i][j]=scanner.nextInt();
			}
		}
		//方向
		int[] dy= {-1,0,1,0};
		int[] dx= {0,1,0,-1};
		int d=1;
		//計算
		while(map[ly][lx]!=0) {
			//吃寶石
			point+=map[ly][lx];
			gem++;
			map[ly][lx]--;
			//轉向
			if(point%K==0) {
				d=(d+1)%4;
			}
			//如果撞牆 出界
			while(true) {
				int y=dy[d];
				int x=dx[d];
				if(ly+y<0||ly+y>=oy||lx+x<0||lx+x>=ox||map[ly+y][lx+x]==-1) {
					d=(d+1)%4;
				}
				else {
					break;
				}
			}
			//移動
			ly+=dy[d];
			lx+=dx[d];
			
		}
		System.out.print(gem);
		
	}

}

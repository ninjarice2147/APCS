package tast;

import java.util.Scanner;

public class RobotPatrol {

	public static void main(String[] args) {
		//輸入
		Scanner scanner=new Scanner(System.in);
		int oy=scanner.nextInt();
		int ox=scanner.nextInt();
		int E=scanner.nextInt();
		String[] om=new String[oy];
		for(int i=0;i<oy;i++) {
			om[i]=scanner.next();
		}
		char[][] map=new char[oy][ox];
		for(int i=0;i<oy;i++) {
			for(int j=0;j<ox;j++) {
				map[i][j]=om[i].charAt(j);
			}
		}
		//方向
		int[] dy= {-1,0,1,0};
		int[] dx= {0,1,0,-1};
		int d=1;
		int x=0;
		int y=0;
		int c = 0;
		int lattice=1;
		while(E>0&&c<4) {
			if(y+dy[d]>=0&&y+dy[d]<oy&&x+dx[d]>=0&&x+dx[d]<ox) {
				if(map[y+dy[d]][x+dx[d]]!='#') {
					y+=dy[d];
					x+=dx[d];
					c=0;
					lattice++;
					E--;
				}
				else {
					d++;
					d=d%4;
					c++;
				}
			}
			else {
				d++;
				d=d%4;
				c++;
			}
			
		}
		System.out.print(lattice);
	}

}

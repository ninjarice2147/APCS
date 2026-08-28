package tast;

import java.util.Arrays;
import java.util.Scanner;

public class comet_impact {

	public static void main(String[] args) {
		//輸入
		Scanner scanner=new Scanner(System.in);
		int oy=scanner.nextInt();
		int ox=scanner.nextInt();
		int d=scanner.nextInt();
		int k=scanner.nextInt();
		int[][] map=new int[oy][ox];
		int[][] m_d=new int[oy][ox];//恐龍地圖數
		for(int i=0;i<oy;i++) {
			Arrays.fill(m_d[i],0);
			Arrays.fill(map[i],d);
		}
		for(int i=0;i<k;i++) {
			int dy=scanner.nextInt();
			int dx=scanner.nextInt();
			m_d[dy][dx]++;
		}
		int m=scanner.nextInt();
		int[][] m_l=new int[m][4];
		for(int i=0;i<m;i++) {
			m_l[i][0]=scanner.nextInt();
			m_l[i][1]=scanner.nextInt();
			m_l[i][2]=scanner.nextInt();
			m_l[i][3]=scanner.nextInt();	
		}
		//計算
		for(int i=0;i<m;i++) {
			int half=m_l[i][2]/2;
			int yBorderAbove=Math.max(0,m_l[i][0]-half);
			int yBorderUnder=Math.min(oy-1,m_l[i][0]+half);
			int xBorderRight=Math.min(ox-1,m_l[i][1]+half);
			int xBorderLeft=Math.max(0,m_l[i][1-half]);
			int checker=0;
			//一次隕石
			//checker=0目前沒有恐龍,=1有過恐龍,=2全部沒有恐龍
			for(int j=yBorderAbove;j<yBorderUnder;j++) {
				for(int p=xBorderLeft;p<xBorderRight;p++) {
					if(m_d[j][p]>0) {
						m_d[j][p]=-1;
						checker=1;
					}
					else if(checker==2) {
						map[j][p]-=m_l[i][3];
					}
					if(j==yBorderUnder-1&&p==xBorderRight-1&&checker==0) {
						j=yBorderAbove;
						p=xBorderLeft;
						checker=2;
					}
				}
			}	
			
		}
		//輸出
		int maxd=map[0][0];
		int mind=map[0][0];
		int ld=0;
		for(int i=0;i<oy;i++) {
			for(int j=0;j<ox;j++) {
				if(maxd<map[i][j]) {
					maxd=map[i][j];
				}
				if(mind>map[i][j]) {
					mind=map[i][j];
				}
				if(m_d[i][j]>0) {
					ld+=m_d[i][j];
				}
			}
		}
		
		System.out.print(maxd+" "+mind+" "+ld);
	}

}

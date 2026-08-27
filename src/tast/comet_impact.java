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
		int[][] k_l=new int[k][2];
		for(int i=0;i<k;i++) {
			k_l[i][0]=scanner.nextInt();
			k_l[i][1]=scanner.nextInt();
		}
		Arrays.fill(map,d);
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
			
			
			
		}
		
		
	}

}

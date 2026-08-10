package tast;

import java.util.Scanner;

public class special_location {

	public static void main(String[] args) {
		//輸入
		Scanner scanner = new Scanner(System.in);
		int oy = scanner.nextInt();
		int ox = scanner.nextInt();
		int[][] map = new int[oy][ox];
		int[][] sp=new int[ox*oy][2];
		int spc=0;
		for (int i = 0; i < oy; i++) {
			for (int j = 0; j < ox; j++) {
				map[i][j]=scanner.nextInt();
				
			}
		}
		//計算
		for(int i=0;i<oy;i++) {
			for(int j=0;j<ox;j++) {
				int sum=0;
				for(int s=0;s<oy;s++) {
					for(int t=0;t<ox;t++) {
						int d=Math.abs(i-s)+Math.abs(j-t);
						if(d<=map[i][j]) {
							sum+=map[s][t];
						}
						
					}
					
				}
				if(sum%10==map[i][j]) {
					
					sp[spc][0]=i;
					sp[spc][1]=j;
					spc++;
				}
			}
		}
		//輸出
		System.out.println(spc);
		for(int i=0;i<spc;i++) {
			System.out.println(sp[i][0]+" "+sp[i][1]);
		
		}
		
	}

}

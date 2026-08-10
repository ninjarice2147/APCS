package tast;

import java.util.Scanner;

public class special_location2 {

	public static void main(String[] args) {
		//輸入
		Scanner scanner = new Scanner(System.in);
		int oy = scanner.nextInt();
		int ox = scanner.nextInt();
		int[][] map=new int[oy][ox];
		int[][] spl=new int[ox*oy][2];
		for(int i=0;i<oy;i++) {
			for(int j=0;j<ox;j++) {
				map[i][j]=scanner.nextInt();
			}
		}
		//計算
		int counter=0;
		for(int i=0;i<oy;i++) {
			for(int j=0;j<ox;j++) {
				int sum=0;
				for(int s=0;s<oy;s++) {
					for(int t=0;t<ox;t++) {
						int d=Math.abs(i-s)+Math.abs(j-t);
						if(map[i][j]>=d) {
							sum+=map[s][t];
						}
						
					}
					
				}
				if(sum%10==map[i][j]%10) {
					spl[counter][0]=i;
					spl[counter][1]=j;
					counter++;
				}
				
			}
		}
		System.out.println(counter);
		for(int i=0;i<counter;i++) {
			System.out.println(spl[i][0]+" "+spl[i][1]);
		}
		

	}

}

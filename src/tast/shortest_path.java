package tast;

import java.util.Scanner;
import java.util.ArrayDeque;

public class shortest_path{

    static class Point {
        int r;
        int c;

        Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        char[][] map = new char[n][m];
        int[][] dist = new int[n][m];

        int startR = 0;
        int startC = 0;
        int targetR = 0;
        int targetC = 0;

        // 初始化 dist，-1 代表還沒走過
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dist[i][j] = -1;
            }
        }

        // 讀入地圖，順便找 S 和 T
        for (int i = 0; i < n; i++) {
            String line = scanner.next();

            for (int j = 0; j < m; j++) {
                map[i][j] = line.charAt(j);

                if (map[i][j] == 'S') {
                    startR = i;
                    startC = j;
                }

                if (map[i][j] == 'T') {
                    targetR = i;
                    targetC = j;
                }
            }
        }

        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};

        ArrayDeque<Point> queue = new ArrayDeque<>();

        // 起點距離是 0，並放進 queue
        dist[startR][startC] = 0;
        queue.add(new Point(startR, startC));

        while (!queue.isEmpty()) {
            Point cur = queue.poll();

            int r = cur.r;
            int c = cur.c;

            // 檢查上下左右
            for (int d = 0; d < 4; d++) {
                int nr = r + dr[d];
                int nc = c + dc[d];

                // 超出地圖
                if (nr < 0 || nr >= n || nc < 0 || nc >= m) {
                    continue;
                }

                // 是牆，不能走
                if (map[nr][nc] == '#') {
                    continue;
                }

                // 已經走過，不用再走
                if (dist[nr][nc] != -1) {
                    continue;
                }

                // 走到下一格，距離 = 目前距離 + 1
                dist[nr][nc] = dist[r][c] + 1;

                // 把下一格放進 queue，之後再從它繼續擴散
                queue.add(new Point(nr, nc));
            }
        }

        System.out.println(dist[targetR][targetC]);

        scanner.close();
    }
}
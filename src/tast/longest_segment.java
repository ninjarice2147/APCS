package tast;

import java.util.Scanner;

public class longest_segment {

    public static class last {
        char word;
        int f;

        public last(char word, int f) {
            this.word = word;
            this.f = f;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.next();

        last[] l = new last[2];

        l[0] = new last('\0', 0);
        l[1] = new last('\0', 0);

        int left = 0;
        int max = 0;

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (ch == l[0].word) {
                l[0].f++;
            } else if (ch == l[1].word) {
                l[1].f++;
            } else if (l[0].f == 0) {
                l[0].word = ch;
                l[0].f = 1;
            } else if (l[1].f == 0) {
                l[1].word = ch;
                l[1].f = 1;
            } else {
                while (l[0].f > 0 && l[1].f > 0) {
                    char leftCh = line.charAt(left);

                    if (leftCh == l[0].word) {
                        l[0].f--;
                    } else if (leftCh == l[1].word) {
                        l[1].f--;
                    }

                    left++;
                }

                if (l[0].f == 0) {
                    l[0].word = ch;
                    l[0].f = 1;
                } else {
                    l[1].word = ch;
                    l[1].f = 1;
                }
            }

            int len = i - left + 1;

            if (len > max) {
                max = len;
            }
        }

        System.out.print(max);

        scanner.close();
    }
}
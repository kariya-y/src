
import java.util.*;
import java.io.*;

public class ABC241_C {
	static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	static char[] abcArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	static char[] ABCArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

	static char[][] figure;
	static int N;
	static int blackCnt;

	public static void main(String[] args) {
		N = nextInt();
		figure = new char[N][N];
		for (int i = 0; i < N; i++) {
			String line = sc.next();
			for (int ii = 0; ii < N; ii++) {
				figure[i][ii] = line.charAt(ii);
			}
		}

		for (int i = 0; i < N; i++) {
			for (int ii = 0; ii < N; ii++) {
				int cntX = 0;
				int cntY = 0;
				int cntPlus = 0;
				int cntMinus = 0;

				for (int iii = 0; iii < 6; iii++) {
					try {
						char x = figure[i][ii + iii];
						if (x == '#') {
							cntX++;
						}
					} catch (Exception e) {
						cntX = 0;
					}

					try {
						char y = figure[i + iii][ii];
						if (y == '#') {
							cntY++;
						}
					} catch (Exception e) {
						cntY=0;
					}

					try {
						char c = figure[i + iii][ii + iii];
						if (c == '#') {
							cntPlus++;
						}
					} catch (Exception e) {
						cntPlus = 0;
					}
					try {
						char c = figure[i + iii][ii - iii];
						if (c == '#') {
							cntMinus++;
						}
					} catch (Exception e) {
						cntMinus = 0;
					}
				}
				if (4 <= cntX || 4 <= cntY || 4 <= cntPlus || 4 <= cntMinus) {
					System.out.println("Yes");
					return;
				}

			}
		}

		System.out.println("No");
	}

}

import java.util.*;

public class Olympic10_E {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	static char[] abcArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	static char[] ABCArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	static int H;
	static int W;
	static char[][] figure;
	static boolean isDone;

	public static void main(String[] args) {
		H = nextInt();
		W = nextInt();
		int N = nextInt();
		int nowX = -1;
		int nowY = -1;
		figure = new char[H][W];

		for (int i = 0; i < H; i++) {
			String line = sc.next();
			for (int ii = 0; ii < W; ii++) {
				figure[i][ii] = line.charAt(ii);
				if (figure[i][ii] == 'S') {
					nowY = i;
					nowX = ii;
				}
			}
		}

		int ans = 0;
		for (int i = 1; i <= N; i++) {
			int[][] isUsed = new int[H][W];
			isDone = false;
			ans += solve(i, 0, isUsed, nowX, nowY);
		}

		System.out.println(ans);

	}

	public static int solve(int target, int num, int[][] isUsed, int nowX, int nowY) {
		if (!isDone) {
			if (nowY < 0 || nowX < 0 || W <= nowX || H <= nowY) {
				return num;
			}
			if (0 < isUsed[nowY][nowX]) {
				return num;
			}
			num++;
			isUsed[nowY][nowX] = num;
			char thisC = figure[nowY][nowX];
			int thisNum = -1;
			if (Character.isDigit(thisC)) {
				thisNum = Character.getNumericValue(thisC);
				if (thisNum == target) {
					isDone = true;
					return num;
				}
			}
			int[] numsY = { 1, -1, 0, 0 };
			int[] numsX = { 0, 0, 1, -1 };
			for (int i = 0; i < 4; i++) {
				if (!isDone) {
					num = solve(target, num, isUsed, nowX + numsX[i], nowY + numsY[i]);
				}
			}
		}
		return num;
	}
}

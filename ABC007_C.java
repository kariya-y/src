import java.awt.Point;
import java.util.*;

public class ABC007_C {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	static char[] abcArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	static char[] ABCArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	static char[][] figure;

	public static void main(String[] args) {
		int R = nextInt();
		int C = nextInt();
		int sY = nextInt()-1;
		int sX = nextInt()-1;
		int gY = nextInt()-1;
		int gX = nextInt()-1;
		figure = new char[R][C];

		for (int i = 0; i < R; i++) {
			String line = sc.next();
			for (int ii = 0; ii < C; ii++) {
				figure[i][ii] = line.charAt(ii);
			}
		}
		sc.close();

		Point start = new Point(sX, sY);
		ArrayDeque<Point> que = new ArrayDeque<>();
		int[][] figureCnt = new int[R][C];
		que.add(start);
		figureCnt[sY][sX] = 0;

		while (que.peek() != null) {
			Point xy = que.poll();
			if (xy.y == gY && xy.x == gX) {
				break;
			}
			int[] loopX = { 1, -1, 0, 0 };
			int[] loopY = { 0, 0, 1, -1 };
			for (int i = 0; i < 4; i++) {
				if(xy.y + loopY[i] < 0 || R <= xy.y + loopY[i] || xy.x + loopX[i] < 0 || C <= xy.x + loopX[i]) {
					continue;
				}
				if(figureCnt[xy.y + loopY[i]][xy.x + loopX[i]] > 0)continue;
				boolean isLoad = isLoad(xy.x + loopX[i], xy.y + loopY[i]);
				if (isLoad) {
					que.add(new Point(xy.x + loopX[i], xy.y + loopY[i]));
					figureCnt[xy.y + loopY[i]][xy.x + loopX[i]] = figureCnt[xy.y][xy.x] + 1;
				}
			}
		}
		System.out.println(figureCnt[gY][gX]);
	}

	public static boolean isLoad(int x, int y) {
		char thisC = figure[y][x];
		if (thisC == '#') {
			return false;
		}
		return true;
	}
}

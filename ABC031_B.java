import java.util.*;

public class ABC031_B {
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
	static int allO;
	static int cnt;
	static boolean ans;

	public static void main(String[] args) {
		figure = new char[10][10];
		allO = 0;
		for (int i = 0; i < figure.length; i++) {
			String line = sc.next();
			for (int ii = 0; ii < figure.length; ii++) {
				figure[i][ii] = line.charAt(ii);
				if (figure[i][ii] == 'o') {
					allO++;
				}
			}
		}
		for (int i = 0; i < figure.length; i++) {
			for (int ii = 0; ii < figure.length; ii++) {
				boolean[][] isUsed = new boolean[figure.length][figure.length];
				cnt = 0;
				solve(i,ii,isUsed,true);
			}
		}
		if(ans) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	public static void solve(int nowY, int nowX, boolean[][] isUsed, boolean isFirst) {
		if(nowX < 0 || figure.length <= nowX || nowY < 0 || figure.length <= nowY) {
			return ;
		}
		if(isUsed[nowY][nowX]) {
			return ;
		}
		isUsed[nowY][nowX] = true;
		char thisC = figure[nowY][nowX];
		if (!isFirst && thisC == 'x') {
			return;
		}
		if(thisC == 'o') {
			cnt++;
			if(cnt == allO) {
				ans = true;
			}
		}
		int[] xNums = {1,0,-1,0};
		int[] yNums = {0,1,0,-1};
		for(int i = 0; i < 4 ; i++) {
			solve(nowY+yNums[i],nowX+xNums[i], isUsed,false);
		}
	}
}
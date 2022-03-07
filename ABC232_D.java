import java.util.*;

public class ABC232_D {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}


	static int ans;
	public static void main(String[] args) {
		int H = nextInt();
		int W = nextInt();
		ans = 0;
		char[][] wall = new char[H][W];
		for (int i = 0; i < H; i++) {
			String str = sc.next();
			for (int ii = 0; ii < W; ii++) {
				wall[i][ii] = str.charAt(ii);
			}
		}



	}
}

import java.util.Map;
import java.util.Scanner;

public class P_B088 {

	static int H;
	static int W;
	static String meiro[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();

		meiro = new String[H][W];
		for (int i = 0; i < H; i++) {
			String line = sc.next();
			for (int j = 0; j < W; j++) {
				meiro[i][j] = String.valueOf(line.charAt(j));
			}
		}

		int height = 0;
		int width = 0;
		while (true) {
			int right = right(height, width);
			if(width < right) {
				width = right;
				continue;
			}
			int under = down(height, width);
			if (height < under) {
				height = under;
				continue;
			}

			int left = left(height, width);
			if (left < width) {
				width = left;
				continue;
			}

			int up = up(height, width);
			if (up < height) {
				height = up;
				continue;
			}

			if (right == width && under == height && left == width && up == height) {
				break;
			}
		}
		System.out.println(width+" "+height);
	}


	private static int right(int height, int width) {
		int result = width;
		while (result + 1 < W) {
			String next = meiro[height][result + 1];
			if (next.equals(".")) {
				meiro[height][result] = "#";
				result++;
			} else {
				break;
			}
		}
		return result;
	}

	private static int down(int height, int width) {
		int result = height;
		while (result + 1 < H) {
			String next = meiro[result + 1][width];
			if (next.equals(".")) {
				meiro[result][width] = "#";
				result++;
			} else {
				break;
			}
		}
		return result;
	}

	private static int left(int height, int width) {
		int result = width;
		while (0 < result) {
			String next = meiro[height][result - 1];
			if (next.equals(".")) {
				meiro[height][result] = "#";
				result--;
			} else {
				break;
			}
		}
		return result;
	}

	private static int up(int height, int width) {
		int result = height;
		while (0 < result) {
			String next = meiro[result - 1][width];
			if (next.equals(".")) {
				meiro[result][width] = "#";
				result--;
			} else {
				break;
			}
		}
		return result;
	}

}

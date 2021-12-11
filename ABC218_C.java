import java.util.*;

public class ABC218_C {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	static int N;

	public static void main(String[] args) {
		N = nextInt();
		String sStrs[][] = new String[N][N];
		String tStrs[][] = new String[N][N];
		for (int i = 0; i < N; i++) {
			String tmp = sc.next();
			for (int j = 0; j < N; j++) {
				sStrs[i][j] = tmp.substring(j, j + 1);
			}
		}
		for (int i = 0; i < N; i++) {
			String tmp = sc.next();
			for (int j = 0; j < N; j++) {
				tStrs[i][j] = tmp.substring(j, j + 1);
			}
		}

		for (int i = 0; i < 4; i++) {
			sStrs = up(sStrs);
			tStrs = up(tStrs);
			sStrs = left(sStrs);
			tStrs = left(tStrs);

			boolean flg = isEquals(sStrs, tStrs);
			if(flg) {
				System.out.println("Yes");
				return;
			}
			sStrs = rotation(sStrs);
		}
		System.out.println("No");
	}

	public static String[][] rotation(String[][] strArray) {
		String resultArray[][] = new String[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				resultArray[i][j] = strArray[N - j - 1][i];
			}
		}
		return resultArray;
	}

	public static String[][] up(String[][] S) {
		for (int i = 0; i < N; i++) {
			if (S[0][i].equals("#")) {
				return S;
			}
		}
		String[][] newS = new String[N][N];
		for (int i = 1; i < N; i++) {
			for (int j = 0; j < N; j++) {
				newS[i - 1][j] = S[i][j];
			}
		}
		for (int i = 0; i < N; i++) {
			newS[N - 1][i] = ".";
		}
		return up(newS);
	}

	public static String[][] left(String[][] S) {
		for (int i = 0; i < N; i++) {
			if (S[i][0].equals("#")) {
				return S;
			}
		}
		String[][] newS = new String[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 1; j < N; j++) {
				newS[i][j - 1] = S[i][j];
			}
		}
		for (int i = 0; i < N; i++) {
			newS[i][N - 1] = ".";
		}
		return left(newS);
	}

	public static boolean isEquals(String[][] s, String[][] t) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				String sString = s[i][j];
				String tString = t[i][j];
				if (!sString.equals(tString)) {
					return false;
				}
			}
		}
		return true;
	}
}

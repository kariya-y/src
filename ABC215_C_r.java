import java.util.*;

public class ABC215_C_r {
	static Scanner sc = new Scanner(System.in);
	static char[] cArray;
	static ArrayList<String> strList;

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		final String S = sc.next();
		cArray = S.toCharArray();
		final int K = nextInt();
		strList = new ArrayList<String>();

		solve(S);

		Collections.sort(strList);
		System.out.println(strList.get(K - 1));
	}

	public static void solve(String S) {
		for (int n = 0; n < S.length(); n++) {
			char cSolveArray[] = new char[cArray.length];
			Arrays.fill(cSolveArray, '0');
			cSolveArray[n] = cArray[0];
			int i = 1;
			while (i < cArray.length) {
				while (isNotMax(cSolveArray)) {
					int numa = (n + i) % cArray.length;
					cSolveArray[numa] = cArray[i];
					i++;
				}
				String value = new String(cSolveArray);
				strList.add(value);
			}
		}
	}

	public static boolean isNotMax(char[] cArray) {
		for (int i = 0; i < cArray.length; i++) {
			if (cArray[i] == '0') {
				return true;
			}
		}
		return false;
	}

}

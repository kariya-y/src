import java.util.*;

public class ABC215_C {
	static Scanner sc = new Scanner(System.in);
	static char[] cArray;
	static ArrayList<String> strList;

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static void main(String[] args) {
		String S = sc.next();
		cArray = S.toCharArray();
		int N  = sc.nextInt();
		strList = new ArrayList<String>();
		for (int i = 0; i < S.length(); i++) {
			solve(i);
		}
		Collections.sort(strList);
		List test = strList;
		System.out.println(strList.get(N-1));
	}

	public static void solve(int num) {
		char cSolveArray[] = new char[cArray.length];
		Arrays.fill(cSolveArray, '0');
		cSolveArray[num] = cArray[0];
		int i = 1;
		while(i < cArray.length) {
			while (isNotMax(cSolveArray)) {
				int numa = (num+i) % (cArray.length);
				cSolveArray[numa] = cArray[i];
				i++;
			}
			String value =  new String(cSolveArray);
			strList.add(value);
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

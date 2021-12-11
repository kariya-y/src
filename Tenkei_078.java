import java.util.*;

public class Tenkei_078 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = nextInt(sc);
		int M = nextInt(sc);

		HashMap<Integer, Integer> numMap = new HashMap();
		for (int i = 1; i <= N; i++) {
			numMap.put(i, 0);
		}

		for (int i = 1; i <= M; i++) {
			int before = nextInt(sc);
			int after = nextInt(sc);
			int l = before < after ? before : after;
			int r = before > after ? before : after;
			int mapNum = numMap.get(r);
			numMap.put(r, ++mapNum);
		}

		int result = 0;
		for (int i = 1; i <= N; i++) {
			int mapNum = numMap.get(i);
			if (mapNum == 1) {
				result++;
			}
		}
		System.out.println(result);
	}

	public static int nextInt(Scanner sc) {
		return Integer.parseInt(sc.next());
	}

}

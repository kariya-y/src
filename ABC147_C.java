import java.util.*;
import java.util.Map.Entry;
import java.util.stream.IntStream;

public class ABC147_C {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	static char[] abcArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	static char[] ABCArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

	public static void main(String[] args) {
		int N = nextInt();

		HashMap<Integer, ArrayList<int[]>> wordMap = new HashMap<>();
		for (int i = 0; i < N; i++) {
			int a = nextInt();
			ArrayList<int[]> wordList = new ArrayList<>();
			for (int ii = 0; ii < a; ii++) {
				int[] xy = { nextInt(), nextInt() };
				wordList.add(xy);
			}
			wordMap.put(i + 1, wordList);
		}

		int ans = 0;
		for (int i = 0; i < 1 << N; i++) {
			int[] bits = new int[N];
			for (int ii = 0; ii < N; ii++) {
				if (((i >> ii) & 1) == 1) {
					bits[ii] = 1;
				} else {
					bits[ii] = 0;
				}
			}

			// 比較実行
			boolean isOK = true;
			int sum = 0;
			for(int ii = 0; ii < N;ii++) {
				int bit = bits[ii];
				if(bit == 1) {
					ArrayList<int[]> list = wordMap.get(ii+1);
					for(int[] xy:list) {
						int x = xy[0];
						int y = xy[1];
						int target01 = bits[x-1];
						if(target01 == y) {

						} else {
							isOK = false;
							break;
						}
					}
				} else {
					continue;
				}
			}

			if(isOK) {
				sum = IntStream.of(bits).sum();
				if(ans < sum) {
					ans = sum;
				}
			}
		}
		System.out.println(ans);
	}
}

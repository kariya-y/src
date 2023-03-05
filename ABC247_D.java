import java.awt.Point;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.IntStream;

class ABC247_D {

	public static int nextInt(Scanner sc) {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong(Scanner sc) {
		return Long.parseLong(sc.next());
	}

	static char[] abcArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	static char[] ABCArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	static int[] numArray;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = nextInt(sc);
		ArrayList<int[]> list = new ArrayList<>();

		for(int i = 0; i < N; i++) {
			int query = nextInt(sc);
			if(query == 1) {
				int[] array = new int[2];
				array[0] = nextInt(sc);
				array[1] = nextInt(sc);
				list.add(array);
			}
			if(query == 2) {
				int cnt = nextInt(sc);
				long sum = 0;
				while(0 < cnt) {
					int[] array = list.get(0);
					if(cnt < array[1]) {
						array[1] -= cnt;
						sum+=(long)array[0]*cnt;
						cnt = 0;
					} else {
						cnt -= array[1];
						sum+=(long)array[0]*array[1];
						list.remove(0);
					}
				}
				System.out.println(sum);
			}
		}

	}
}

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.io.*;


public class ABC244_C {
	static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

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
		int[] array = IntStream.range(1,2*N+2).toArray();
		List<Integer> list = (ArrayList<Integer>) Arrays.stream(array).boxed().collect(Collectors.toList());

		for(int i = 0; i < N; i++) {
			System.out.println(list.get(0));
			list.remove(0);
			int aoki = nextInt();
			int idx = list.indexOf(aoki);
			list.remove(idx);
		}
		System.out.println(list.get(0));
		int aoki = nextInt();
		sc.close();
	}
}


import java.util.*;
import java.util.Map.Entry;
import java.util.stream.IntStream;
import java.io.*;

public class ABC242_B {
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
		String str = sc.next();
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		for (int i = 0; i < str.length(); i++) {
			String a = str.substring(i, i + 1);
			if (treeMap.containsKey(a)) {
				treeMap.put(a, treeMap.get(a) + 1);
			} else {
				treeMap.put(a, 1);
			}
		}

		for (Entry<String, Integer> set : treeMap.entrySet()) {
			for (int i = 0; i < set.getValue(); i++) {
				System.out.print(set.getKey());
			}
		}
	}

}

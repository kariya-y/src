
import java.util.*;
import java.io.*;

/**
 *
 */

public class ABC276_C {
	public static int nextInt(Scanner sc) {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong(Scanner sc) {
		return Long.parseLong(sc.next());
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = nextInt(sc);
		int[] array = new int[N];
		for(int i =0; i < N ; i++) {
			array[i] = nextInt(sc);
		}
		TreeMap<Integer, Integer> treeMap= new TreeMap<>();
		fsolve(array, array.length, treeMap);

		sc.close();

	}

	public static void fsolve(int[] array,int idx, TreeMap treeMap) {
		int num = array[idx];
		for(int i = idx-1; 0 <= i; i--) {
			if(array[i] > num) {
				treeMap.put(idx, i);
			}
		}
	}

	static char[] abcArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	static char[] ABCArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
}

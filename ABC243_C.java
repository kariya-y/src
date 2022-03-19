
import java.util.*;
import java.awt.Point;
import java.io.*;

public class ABC243_C {
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
		Point[] points = new Point[N];
		for (int i = 0; i < N; i++) {
			int x  = nextInt();
			int y = nextInt();
			points[i] = new Point(x,y);
		}

		String line = sc.next();
		char[] charArray = line.toCharArray();
		HashMap<Integer,int[]> map = new HashMap<>();
		for(int i = 0; i < N;i++) {
			Point p = points[i];
			char c = charArray[i];
			if(map.containsKey(p.y)) {
				int[] array = map.get(p.y);
				if(c == 'R') {
					if(array[0] != -1) {
						array[0] = Math.min(array[0], p.x);
					} else {
						array[0] = p.x;
					}
				} else {
					if(array[1] != -1) {
						array[1] = Math.max(array[1], p.x);
					} else {
						array[1] = p.x;
					}
				}
				map.put(p.y,array);
				if(array[0] != -1 && array[1] != -1 && array[0] < array[1]) {
					System.out.println("Yes");
					return;
				}
			} else {
				int[] array = new int[2];
				if(c == 'R') {
					array[0] = p.x;
					array[1] = -1;
				} else {
					array[0] = -1;
					array[1] = p.x;
				}
				map.put(p.y,array);
			}
		}
		System.out.println("No");
	}
}

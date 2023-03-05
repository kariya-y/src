
import java.util.*;
import java.io.*;

public class ABC244_D {
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
		String line = sc.nextLine();
		String[] start = line.split(" ", 0);
		line = sc.nextLine();
		String[] goal = line.split(" ", 0);

		int wrong = 0;
		for (int i = 0; i < start.length; i++) {
			if (!start[i].equals(goal[i])) {
				wrong++;
			}
		}
		if (wrong != 2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}


import java.util.*;
import java.io.*;


public class ABC239_C {
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
		int x1 = nextInt();
		int y1 = nextInt();
		int x2 = nextInt();
		int y2 = nextInt();
		ArrayList<int[]> firstList = solve(x1,y1);
		ArrayList<int[]> secondList = solve(x2,y2);

		for(int[] array1:firstList) {
			for(int[] array2:secondList) {
				if(array1[0] == array2[0]&&array1[1] == array2[1]) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}

	static ArrayList<int[]> solve(int x, int y) {
		ArrayList<int[]> list = new ArrayList<>();
		int[] arrayX = {1,2,2,1,-1,-2,-2,-1};
		int[] arrayY = {2,1,-1,-2,-2,-1,1,2};
		for(int i = 0 ; i < arrayX.length; i++) {
			int[] xy = {x+arrayX[i],y+arrayY[i]};
			list.add(xy);
		}
		return list;
	}
}

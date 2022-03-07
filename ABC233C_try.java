import java.util.*;

public class ABC233C_try {
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
		int N = sc.nextInt();
		ArrayList<double[]> list = new ArrayList<>();
		ArrayList<int[]> abList = new ArrayList<>();
		double totalTime = 0;
		long totalDis = 0;
		for (int i = 0; i < N; i++) {
			int a = nextInt();
			int b = nextInt();
			int[] ab = { a, b };
			abList.add(ab);
			totalDis += a;
			totalTime += (double) a / b;
			double[] array = { totalTime, totalDis };
			list.add(array);
		}

		double halfTime = totalTime / 2;
		int index = 0;
		double listTime = list.get(0)[0];
		while(listTime < halfTime) {
			index++;
			listTime = list.get(index)[0];
		}
		double[] array = list.get(index);
		int[] abArray = abList.get(index);
		double mod = listTime - halfTime;
		double result = array[1] - mod * abArray[1];

		System.out.println(result);

	}
}

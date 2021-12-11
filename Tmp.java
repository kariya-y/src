import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.*;

public class Tmp {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static void main(String[] args) {

		int N = 3;

		ArrayList<Integer> numList = new ArrayList();
		for (int i = 0; i < N; i++) {
			int tmp = nextInt();
			numList.add(tmp);
		}
		if (numList.get(0) == numList.get(1) || numList.get(0) == numList.get(2)
				|| numList.get(1) == numList.get(2)) {
			System.out.println(numList.get(0) + " ： " + numList.get(1) + " ： " + numList.get(2));
		}

		int a = numList.get(0);
		int b = numList.get(1);
		int c = numList.get(2);
		if (a == b || a == c
				|| b == c) {
			System.out.println("abc");
		}

		int ans = 0;
		for (int i = 0; i < numList.size(); i++) {
			for (int j = i + 1; j < numList.size(); j++) {
				for (int k = j + 1; k < numList.size(); k++) {
					if (numList.get(i) == numList.get(j) || numList.get(i) == numList.get(k)
							|| numList.get(j) == numList.get(k))
						continue;
					if (numList.get(i) < numList.get(j) + numList.get(k)
							&& numList.get(j) < numList.get(i) + numList.get(k)
							&& numList.get(k) < numList.get(i) + numList.get(j)) {
						ans++;
						System.out.println(numList.get(i) + "　" + numList.get(j) + "　" + numList.get(k));
					}
				}
			}
		}
		System.out.println(ans);

	}
}

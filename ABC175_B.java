import java.util.*;

public class ABC175_B {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int N = nextInt();

		ArrayList<Long> numList = new ArrayList();
		for (int i = 0; i < N; i++) {
			long tmp = nextInt();
			numList.add(tmp);
		}

		int ans = 0;
		for (int i = 0; i < numList.size(); i++) {
			for (int j = i + 1; j < numList.size(); j++) {
				for (int k = j + 1; k < numList.size(); k++) {
					if (numList.get(i) == numList.get(j) || numList.get(i) == numList.get(k)
							|| numList.get(j) == numList.get(k)) continue;
						if (numList.get(i) < numList.get(j) + numList.get(k)
								&& numList.get(j) < numList.get(i) + numList.get(k)
								&& numList.get(k) < numList.get(i) + numList.get(j)) {
							ans++;
							System.out.println(numList.get(i) +"："+ numList.get(j) +"："+ numList.get(k));
						}
					}
				}
			}
		System.out.println(ans);
	}
}

import java.util.*;
import java.util.Scanner;

public class C210 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		int numArray[] = new int[N];
		for (int i = 0; i < N; i++) {
			numArray[i] = sc.nextInt();
		}

		int result = 1;
		List<Integer> numList = new ArrayList();
		for (int i = 0; i < N - K; i++) {
			for (int j = 0; j < K; j++) {
				if (numList.contains(numArray[j])) {
					if (result < numList.size()) {
						result = numList.size();
					}
					break;
				} else {
					numList.add(numArray[j]);
				}
			}
		}
	}
}

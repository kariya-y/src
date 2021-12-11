import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class C208 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final long K = sc.nextLong();

		final long WARU = K / N;
		final long AMARI = K % N;

		if(N == 1) {
			System.out.println(K);
			return;
		}

		Map<String,Integer> peopleMap = new TreeMap();
		long resultArray[] = new long[N];
		for(int i = 0; i < N; i++) {
			String kokumin = sc.next();
			peopleMap.put(kokumin, i);
		}

		int num = 0;
		for(String key: peopleMap.keySet()) {
			int order = peopleMap.get(key);
			if(num < AMARI) {
				resultArray[order] = WARU + 1;
			} else {
				resultArray[order] = WARU;
			}
			num++;
		}

		for(int i = 0; i < N ; i++) {
			System.out.println(resultArray[i]);
		}
	}
}

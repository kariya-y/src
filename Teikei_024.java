import java.io.PrintWriter;
import java.util.Scanner;

public class Teikei_024 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		long K = Long.parseLong(sc.next());
		int arrayA[] = new int[N];
		int arrayB[] = new int[N];

		for(int i = 0; i < N ; i++) {
			arrayA[i] = Integer.parseInt(sc.next());
		}
		for(int i = 0; i < N ; i++) {
			arrayB[i] = Integer.parseInt(sc.next());
		}

		long absNum = 0;
		for(int i =0; i < N; i++) {
			int a = arrayA[i];
			int b = arrayB[i];
			absNum += Math.abs(a-b);
		}

		if(absNum > K) {
			System.out.println("No");
			return;
		}

		long result = K - absNum;
		if(result % 2 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

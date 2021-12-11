import java.util.*;

public class Tenkei_016 {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	public static void main(String[] args) {
		int N = nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(nextInt());
		list.add(nextInt());
		list.add(nextInt());
		Collections.sort(list);

		for(int i = 0; i <= N/list.get(0) ; i++) {
			int coins = i;
			long tmpN = N;

			for(int ii = 0; ii <= N/list.get(1); ii++) {
				coins = i+ii;
				tmpN = N - (list.get(0)*i) - (list.get(1)*ii);
				if(tmpN == 0 ) {
					System.out.println(coins);
					return;
				}
				if(tmpN < 0) {
					break;
				}

				coins += tmpN / list.get(2);
				long amari = tmpN % list.get(2);
				if(amari == 0 ) {
					System.out.println(coins);
					return;
				}
			}
		}
	}
}

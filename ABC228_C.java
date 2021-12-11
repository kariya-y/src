import java.util.*;

public class ABC228_C {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	public static void main(String[] args) {
		int N = nextInt();
		int K = nextInt();
		ArrayList<Integer> threeDaysList= new ArrayList<>();
		ArrayList<Integer> threeDaysDesc = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			int[] scores = {nextInt(),nextInt(),nextInt()};
			int sum = scores[0]+scores[1]+scores[2];
			threeDaysDesc.add(sum);
			threeDaysList.add(sum);
		}
		Collections.sort(threeDaysDesc,Comparator.reverseOrder());
		int minResult = threeDaysDesc.get(K-1);
		for(int tmp: threeDaysList) {
			if(minResult <= tmp+300) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}

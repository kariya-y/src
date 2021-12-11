import java.util.*;

public class ABC086_C {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static void main(String[] args) {
		int N = nextInt();
		int[] start = {0,0};
		int startTime = 0;
		for(int i = 0; i < N; i++) {
			int time = nextInt();
			int[] next = {nextInt(),nextInt()};
			int x = Math.abs(start[0]-next[0]);
			int y = Math.abs(start[1]-next[1]);
			int sum = x+y;
			if(sum > time - startTime || (time-startTime-sum) % 2 == 1) {
				System.out.println("No");
				return;
			}
			startTime = time;
			start = next;
		}
		System.out.println("Yes");
	}
}

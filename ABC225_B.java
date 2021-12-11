import java.util.*;

public class ABC225_B {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static void main(String[] args) {
		int N = nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		int root = -1;
		int[] first = {nextInt(),nextInt()};
		int[] second = {nextInt(),nextInt()};
		for(int i = 0; i < 2; i++) {
			if(first[0] == second[i]) {
				root = first[0];
			} else {
				list.add(first[0]);
			}
			if(first[1] == second[i]) {
				root = first[1];
				list.add(first[1]);
			}
		}
		if(root == -1) {
			System.out.println("No");
		}
		for(int i = 0; i < N - 3; i++) {
			int[] tmp = {nextInt(),nextInt()};
			int num = -1;
			if(tmp[0] == root) {
				num = tmp[1];
			} else {
				num = tmp[0];
			}
			if(list.contains(num)) {
				System.out.println("No");
				return;
			} else {
				list.add(num);
			}
		}
		System.out.println("Yes");
	}
}

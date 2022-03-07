import java.io.PrintWriter;
import java.util.*;

public class ABC235_C {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	static char[] abcArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	static char[] ABCArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	static HashMap<Integer, ArrayList<Integer>> map;

	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		int Q = sc.nextInt();

		map = new HashMap<>();
		for(int i = 0; i < N ; i++) {
			int num = nextInt();
			if(map.containsKey(num)) {
				ArrayList<Integer> list = map.get(num);
				list.add(i+1);
				map.put(num,list);
			} else {
				ArrayList<Integer> list = new ArrayList<>();
				list.add(i+1);
				map.put(num,list);
			}
		}

		for(int i = 0; i < Q; i++) {
			int x = nextInt();
			int y = nextInt();
			out.println(solve(x,y));
		}
		out.flush();

	}

	public static int solve(int x, int y) {
		if(map.containsKey(x)) {
			ArrayList<Integer> list = map.get(x);
			try {
				Integer num = list.get(y-1);
				return num;
			}catch(Exception e) {
				return -1;
			}
		}
		return -1;
	}
}

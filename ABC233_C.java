import java.util.*;

public class ABC233_C {
	static Scanner sc = new Scanner(System.in);
	static int N;
	static long X;
	static long ans;

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	static char[] abcArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	static char[] ABCArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

	public static void main(String[] args) {
		N = nextInt();
		X = nextLong();

		ArrayList<long[]> list = new ArrayList<>();
		for(int i = 0; i < N ; i++) {
			int l = nextInt();
			long[] array = new long[l];
			for(int ii = 0; ii < l ; ii++) {
				array[ii] = nextLong();
			}
			Arrays.sort(array);
			list.add(array);
		}

		long[] numbers = new long[(int)N];
		for(int i = 0; i < list.get(0).length ; i++) {
			numbers[0] = list.get(0)[i];
			for(int ii = 1; ii < N; ii++) {
				for(int iii = 0; iii < list.get(ii).length;iii++) {
					solve(list,ii,iii,numbers);
				}
			}
		}


	}
	static void solve(ArrayList<long[]> list,int listIdx,int arrayIdx,long[] numbers) {
		if(numbers[N] != 0) {
			long sum = 1;
			for(long tmp : numbers) {
				sum *= tmp;
			}
			if(sum == X) {
				ans++;
			}
			Arrays.fill(numbers,0);
			return;
		}
		numbers[listIdx] = list.get(listIdx)[arrayIdx];
		solve(list,listIdx+1,arrayIdx,numbers);

	}
}

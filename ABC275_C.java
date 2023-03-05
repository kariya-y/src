import java.awt.Point;
import java.math.BigInteger;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.*;

class ABC275_C {

	public static int nextInt(Scanner sc) {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong(Scanner sc) {
		return Long.parseLong(sc.next());
	}

	static char[] abcArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	static char[] ABCArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	static char[][] figure;
	static ArrayList<int[]> list;
	static int ans = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		figure = new char[9][9];

		list = new ArrayList<>();
		for (int i = 0; i < 9; i++) {
			String line = sc.next();
			for (int ii = 0; ii < 9; ii++) {
				figure[i][ii] = line.charAt(ii);
				if (figure[i][ii] == '#') {
					int[] array = { i, ii };
					list.add(array);
				}
			}
		}

		for (int i = 0; i < list.size() - 3; i++) {
			int[] xy = list.get(i);
			solve(xy, i);
		}
		System.out.println(ans);
		sc.close();
	}

	public static void solve(int[] xy1, int idx) {
		for (int i = idx + 1; i < list.size(); i++) {
			int[] xy2 = list.get(i);
			for (int ii = i + 1; ii < list.size(); ii++) {
				int[] xy3 = list.get(ii);
				for (int iii = ii + 1; iii < list.size(); iii++) {
					int[] xy4 = list.get(iii);
					double d1 = (xy1[0] - xy2[0])*(xy1[0] - xy2[0]) + (xy1[1] - xy2[1])*(xy1[1] - xy2[1]);
					d1 = Math.sqrt(d1);
					double d2 = (xy1[0] - xy3[0])*(xy1[0] - xy3[0]) + (xy1[1] - xy3[1])*(xy1[1] - xy3[1]);
					d2 = Math.sqrt(d2);

					double d3 = (xy1[0] - xy4[0])*(xy1[0] - xy4[0]) + (xy1[1] - xy4[1])*(xy1[1] - xy4[1]);
					d3 = Math.sqrt(d3);

					double d4 = (xy2[0] - xy3[0])*(xy2[0] - xy3[0]) + (xy2[1] - xy3[1])*(xy2[1] - xy3[1]);
					d4 = Math.sqrt(d4);

					double d5 = (xy2[0] - xy4[0])*(xy2[0] - xy4[0]) + (xy2[1] - xy4[1])*(xy2[1] - xy4[1]);
					d5 = Math.sqrt(d5);

					double d6 = (xy3[0] - xy4[0])*(xy3[0] - xy4[0]) + (xy3[1] - xy4[1])*(xy3[1] - xy4[1]);
					d6 = Math.sqrt(d6);

					double[] array = { d1, d2, d3, d4, d5, d6 };
					Arrays.sort(array);

					if (array[0] == array[1] && array[1] == array[2] & array[2] == array[3]) {
						if(array[4] == array[5]) {
							if(array[4] == Math.sqrt(array[0]*array[0] + array[0]*array[0]) ) {
								ans++;
							}
						}
					}
				}
			}
		}
	}

}
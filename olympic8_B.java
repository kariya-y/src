import java.util.*;

public class olympic8_B {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	static char[] abcArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	static char[] ABCArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

	public static void main(String[] args) {
		int N = nextInt();
		int shopCnt = nextInt();
		int customerCnt = nextInt();

		int[] shopArray = new int[shopCnt];
		shopArray[0] = 0;
		for (int i = 1; i < shopCnt; i++) {
			shopArray[i] = nextInt();
		}
		Arrays.sort(shopArray);

		long sum = 0;
		for (int i = 0; i < customerCnt; i++) {
			int customer = nextInt();
			int[] idxArray = serch2(shopArray, customer);
			if (idxArray[0] == 0 && idxArray[1] == shopArray.length-1) {
				int first = Math.abs(N-customer);
				int second = Math.abs(customer - shopArray[idxArray[1]]);
				sum += Math.min(first, second);
			} else {
				int first = Math.abs(shopArray[idxArray[0]] - customer);
				int second = Math.abs(shopArray[idxArray[1]] - customer);
				sum += Math.min(first, second);
			}
		}

		System.out.println(sum);

	}

	static int[] serch2(int[] shopArray, int target) {
		int[] idxArray = new int[2];
		int l = 0;
		int r = shopArray.length;
		while (l < r) {
			int middle = (l + r) / 2;
			int middleShop = shopArray[middle];

			if (middleShop == target) {
				idxArray[0] = middle;
				idxArray[1] = middle;
				return idxArray;
			}

			try {
				int beforeShop = shopArray[middle - 1];
				if (beforeShop < target && target < middleShop) {
					idxArray[0] = middle - 1;
					idxArray[1] = middle;
					return idxArray;
				}
			} catch (Exception e) {
				idxArray[0] = 0;
				idxArray[1] = 0;
				return idxArray;
			}

			try {
				int afterShop = shopArray[middle + 1];
				if (middleShop < target && target < afterShop) {
					idxArray[0] = middle;
					idxArray[1] = middle + 1;
					return idxArray;
				}
			} catch (Exception e) {
				idxArray[0] = 0;
				idxArray[1] = shopArray.length - 1;
				return idxArray;
			}

			if (target < middleShop) {
				r = middle;
				continue;
			}

			if (target > middleShop) {
				l = middle;
				continue;
			}

		}

		idxArray[0] = -1;
		idxArray[1] = -1;
		return idxArray;
	}
}

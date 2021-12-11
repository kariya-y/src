import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C206 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();

		int arrayInt[] = new int[N];
		for (int i = 0; i < N; i++) {
			arrayInt[i] = sc.nextInt();
		}

		int ans = 0;
		List<Integer> numList = new ArrayList();
		for (int i = 0; i < N; i++) {
			for (int a = 0; a <= N; a++) {
				for (int j = i + 1; j <= N; j++) {
					int left = arrayInt[i] + a;
					int right = j;
					if (left < right && !isExist(arrayInt[i],arrayInt)) {
						System.out.println("left :" + left);
						System.out.println("right:" + right);
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}

	public static boolean isExist(int num, int array[]) {
		boolean result = false;
		int count = 0;
		for(int i = 0; i < array.length ; i++) {
			if(num == array[i]) {
				count++;
			}
		}
		if(2 < count) {
			result =  true;
		}

		return result;
	}

}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B197 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int H = sc.nextInt();
		final int W = sc.nextInt();
		final int X = sc.nextInt();
		final int Y = sc.nextInt();

		String tmp = sc.nextLine();
		List<String> strList = new ArrayList();
		for (int i = 0; i < H; i++) {
			strList.add(sc.nextLine());
		}

		int result = 1;

		// 右へ数える
		for (int i = Y; i < W; i++) {
			String line = strList.get(X - 1);
			if (line.charAt(i) == '.') {
				result++;
			} else {
				break;
			}
		}
		System.out.println("右："+result);

		// 左へ数える
		for (int i = Y - 2; 0 < i; i--) {
			String line = strList.get(X - 1);
			if (line.charAt(i-1) == '.') {
				result++;
			} else {
				break;
			}
		}
		System.out.println("左："+result);

		// 上へ数える
		for (int i = X; i < H; i++) {
			String line = strList.get(i);
			if (line.charAt(Y-1) == '.') {
				result++;
			} else {
				break;
			}
		}
		System.out.println("上："+result);

		// 下へ数える
		for (int i = X - 2; 0 <= i; i--) {
			String line = strList.get(i);
			if (line.charAt(Y-1) == '.') {
				result++;
			} else {
				break;
			}
		}
		System.out.println("下："+result);
		System.out.println(result);

	}

}

import java.util.Scanner;

public class B198 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		while (1 < line.length()) {
			if (line.charAt(line.length() - 1) == '0') {
				line = line.substring(0, line.length() - 1);
			} else {
				break;
			}
		}



		if (line.length() == 1) {
			System.out.println("Yes");
			return;
		}


		int rightEnd = 0;
		int leftStart = 0;
		if(line.length() % 2 > 0) {
			rightEnd = line.length() / 2 + 1;
			leftStart = line.length() / 2;
		} else {
			rightEnd = line.length() / 2;
			leftStart = line.length() / 2;
		}

		String right = line.substring(0, rightEnd);
		String left = line.substring(leftStart, line.length());

		String leftRe = "";
		for(int i = left.length() - 1; 0 <= i; i--) {
			leftRe += left.charAt(i);
		}

		if(right.contentEquals(leftRe)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}

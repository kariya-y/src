import java.util.Scanner;
public class A208 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int dice = sc.nextInt();
		int num = sc.nextInt();

		if(dice -1  < num && num <= 6*dice) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}


	}

}

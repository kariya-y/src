import java.util.Scanner;

public class P_C013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		int m = sc.nextInt();

		String strArray[] = new String[m];

		boolean flg = false;
		for(int i = 0; i < m; i++) {
			String str = sc.next();
			if(str.indexOf(n) == -1) {
				System.out.println(str);
				flg = true;
			}
		}

		if(!flg) {
			System.out.println("none");
		}

	}

}

import java.util.*;

public class Tenkei_067 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String nstr = sc.next();
		final int K = sc.nextInt();
		Long n = Long.parseLong(nstr,8);
		System.out.println(n);
		for(int i = 0; i < K; i++) {
			String n9 =  Long.toString(n,9);
			n9= n9.replace("8", "5");
			n = Long.parseLong(n9,8);
		}
		System.out.println(Long.toString(n, 8));

		String num = "17";
		System.out.println(Long.parseLong(num,8));

		String num2 ="101";
		System.out.println(Long.parseLong(num2,2));
	}
}

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Tenkei_027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		final int N = Integer.parseInt(sc.next());
		ArrayList<String> strList = new ArrayList();
		int date = 1;
		for(int i = 0; i < N; i++) {
			String str = sc.next();
			if(!strList.contains(str)) {
				strList.add(str);
				System.out.println(date);
			}
			date++;
		}
	}

}

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B202 {

	static Map hanten = new HashMap<String, String>(){{
		put("0","0");
		put("1","1");
		put("2","2");
		put("3","3");
		put("4","4");
		put("5","5");
		put("6","9");
		put("7","7");
		put("8","8");
		put("9","6");}};

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String scStr = sc.nextLine();

		StringBuilder stb= new StringBuilder(scStr);
		stb = stb.reverse();

		String str = stb.toString();
		for(int i = 0; i < str.length(); i++) {
			System.out.print(hanten.get(str.substring(i,i+1)));
		}
	}

}

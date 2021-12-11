import java.util.*;

public class ABC223_B {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static void main(String[] args) {
		String str = sc.next();
		List<String> list = new ArrayList<String>();
		list.add(str);
		String tmp = str;
		for(int i = 1; i < str.length(); i++) {
			tmp = tmp.substring(tmp.length()-1,tmp.length())+tmp.substring(0,tmp.length()-1);
			list.add(tmp);
		}
		Collections.sort(list);
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
	}
}

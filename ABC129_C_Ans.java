import java.util.*;

public class ABC129_C_Ans {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static void main(String[] args) {
		String s = sc.next();
		int N = nextInt();
		ArrayList<String> nameList = new ArrayList<>();
		ArrayList<Character> lastAlphabet = new ArrayList<Character>();
		for(int i = 0; i < N ;i++) {
			nameList.add(sc.next());
		}

		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String o1,String o2) {
				int intShortest = Math.min(o1.length(), o2.length());
				for(int i = 0; i < intShortest; i++) {
					if(o1.charAt(i) != o2.charAt(i)) {
						return lastAlphabet.indexOf(o1.charAt(i)) > lastAlphabet.indexOf(o2.charAt(i))? 1: -1;
					}
				}
				return o1.length() > o2.length()?1:-1;
			}
		};
		nameList.sort(comparator);
		for(String name: nameList) {
			System.out.println(name);
		}

	}
}

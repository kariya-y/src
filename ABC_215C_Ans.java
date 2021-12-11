import java.util.*;

public class ABC_215C_Ans {
	static Scanner sc = new Scanner(System.in);
	public static List<String> wordList = new ArrayList<String>();
	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String line = sc.nextLine();
		String test = line.split(" ")[0];
		System.out.println(test);
		permutation(line.split(" ")[0], "");
		// 重複削除
		Collections.sort(wordList);
		ArrayList<String> wordListNoDup = new ArrayList<String>(new LinkedHashSet<>(wordList));
		// 出力
		System.out.println(wordListNoDup.get(Integer.parseInt(line.split(" ")[1]) -1));
	}

	public static void permutation(String q, String ans) {
		if(q.length() <= 1) {
			wordList.add(ans + q);
		} else {
			for (int i = 0; i < q.length(); i++) {
				System.out.println(ans);
				System.out.println(q.substring(0, i));
				System.out.println( q.substring(i + 1));
				System.out.println(q.charAt(i));
				permutation(q.substring(0, i) + q.substring(i + 1),ans + q.charAt(i));
			}
		}
	}
}

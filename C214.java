import java.io.PrintWriter;
import java.util.*;

public class C214 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		final int N = Integer.parseInt(sc.next());
		List<Integer> sList = new ArrayList();
		List<Integer> tList = new ArrayList();

		for (int i = 0; i < N; i++) {
			sList.add(Integer.parseInt(sc.next()));
		}
		for (int i = 0; i < N; i++) {
			tList.add(Integer.parseInt(sc.next()));
		}

		List<Integer> tListOrg = new ArrayList<Integer>(tList);
		Collections.sort(tList);
		LinkedHashMap<Integer,Integer> resultMap = new LinkedHashMap();

		int time = tList.get(0);
		int index = tListOrg.indexOf(time);
		System.out.println(time);
		resultMap.put(index, time);

		tList.remove(0);
		int sBefore = time;
		LinkedHashMap<Integer,Integer> sMap = new LinkedHashMap();
		sMap.put(sList.get(index), index);

		for(int i = 0; i < N; i++) {

		}


		for(Integer i: resultMap.keySet()) {
			System.out.println(i);
		}

		System.out.println(tListOrg.get(0));
	}

}

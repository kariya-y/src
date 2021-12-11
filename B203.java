import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeMap;

public class B203 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int N = Integer.parseInt(sc.next());
		TreeMap<Integer, Integer> numTree = new TreeMap();
		for(int i = 0; i < N ; i++) {
			numTree.put(Integer.parseInt(sc.next()),i);
		}

		int num = 0;
		for(int key: numTree.keySet()) {
			if(num == N -2) {
				System.out.println(numTree.get(key)+1);
				return;
			}
			num++;
		}
	}

}

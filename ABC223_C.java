import java.util.*;

public class ABC223_C {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}
	public static void main(String[] args) {
		int N = sc.nextInt();

		ArrayList<double[]> list = new ArrayList<double[]>();
		for(int i = 0; i < N;i++) {
			double a = sc.nextInt();
			double b = sc.nextInt();
			double[] tmp;
			if(a < b) {
				tmp = new double[]{a,b,a/b};
			} else {
				tmp = new double[]{a,b,a*b};
			}
			list.add(tmp);
		}

		double ans = 0;
		while(1 < list.size()) {
			double[] first = list.get(0);
			double[] last = list.get(list.size()-1);

			// 同じ時間で消費
			if(first[2]==last[2]) {
				ans+= first[2];
				list.remove(0);
				if(!list.isEmpty()) {
					list.remove(list.size()-1);
				}
				continue;
			}

			// 前半が早く消費
			if(first[2]< last[2]) {
				last[2] =last[2] - first[2];
				list.set(list.size()-1,last);
				list.remove(0);
				ans += first[2];
				continue;
			}

			// 後半が早く消費
			if(first[2] > last[2]) {
				first[2] =first[2] - last[2];
				list.set(0,first);
				list.remove(list.size()-1);
				ans += last[2];
				continue;
			}
		}

		if(list.size() == 0) {
			System.out.println(ans);
			return ;
		}

		double[] lastArray = list.get(0);
		double a = lastArray[0];
		double b = lastArray[1];
		double c = lastArray[2];
		double tmp = 0;
		if(a < b) {
			tmp = a/b;
		} else {
			tmp = a*b;
		}

		System.out.println(ans);


	}
}

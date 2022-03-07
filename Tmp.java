import java.util.*;

class Tmp {
	public static void MergeSort(int[] A, int[] C, int l, int r) {
		if(r-l==1)return;

		int m = (l+r)/2;
		MergeSort(A,C, l ,m);
		MergeSort(A,C, m ,r);

		int c1 = l, c2 = m, cnt = 0;
		while(c1 != m || c2 != r) {
			if(c1==m) {
				// 列Aが空の場合
				C[cnt] = A[c2];
				c2++;
			} else if(c2 == r) {
				// 列Bが空の場合
				C[cnt] = A[c1];
				c1++;
			} else {
				if(A[c1] <= A[c2]) {
					C[cnt] = A[c1];
					c1++;
				} else {
					C[cnt] = A[c2];
					c2++;
				}
			}
			cnt++;
		}
		for (int i = 0; i < cnt; i++) A[l + i] = C[i];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力
		int N = sc.nextInt();
		int[] A = new int[N + 1];
		int[] C = new int[N + 1];
		for (int i = 1; i <= N; i++) A[i] = sc.nextInt();

		// マージソート
		MergeSort(A, C, 1, N + 1);

		// 出力
		for (int i = 1; i <= N; i++) {
			System.out.println(A[i]);
		}
	}
}
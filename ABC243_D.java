
import java.util.*;
import java.io.*;


public class ABC243_D {
	static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	static char[] abcArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	static char[] ABCArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

	public static void main(String[] args) {
		class TreeNode{
			long data;
			long left;
			long right;
			TreeNode (long data){
				this.data = data;
				this.left = data*2;
				this.right = data*2+1;
			}
		}
		int N  =nextInt();
		long x = nextLong();
		String line = sc.next();
		char[] array = line.toCharArray();
		TreeNode node = new TreeNode(x);
//		ArrayList<> list = new ArrayList<>();
		for(char c: array) {
			if(c == 'R') {
				node = new TreeNode(node.right);
			}
			if(c=='L') {
				node = new TreeNode(node.left);
			}
			if(c=='U') {
				node = new TreeNode(node.data/2);
			}
		}
		System.out.println(node.data);
		sc.close();
	}
}

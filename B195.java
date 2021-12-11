import java.util.Scanner;

public class B195 {

	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       int A = sc.nextInt();
	       int B = sc.nextInt();
	       int W = sc.nextInt();

	       int n = 1;
	       int lower = -1;
	       int upper = -1;
	       while(A*n <= W*1000) {
	    	   if(W*1000 <= B*n) {
		    	   upper = n;
		    	   if(lower == -1) {
		    		   lower = n;
		    	   }
	    	   }
   		   n++;
	       }

	       if(lower == -1) {
	    	   System.out.println("UNSATISFIABLE");
	       } else {
	    	   System.out.println(lower +" "+upper);
	       }
	}

}

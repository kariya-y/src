import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class C211 {

	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       String S = sc.nextLine();

	       final String CHOKU = "chokudai";
	       final int CHOKUSIZE = 8;

	       Map<String, List> strMap = new LinkedHashMap();
	       for(int i = 0; i < CHOKUSIZE; i++) {
	    	   String str = String.valueOf(CHOKU.charAt(i));
	    	   List<Integer> numList = new ArrayList();

	    	   int num = -1;
	    	   while(S.length() > num) {
	    		   int tmp = S.indexOf(str,num);
	    		   if(num < tmp) {
	    			   numList.add(tmp);
	    			   num = tmp+1;
	    		   } else {
	    			   break;
	    		   }
	    	   }
	    	   strMap.put(str,numList);
	       }



	}

}

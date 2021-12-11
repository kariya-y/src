import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tenkei_067_ans1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N=sc.next();
		int K=sc.nextInt();
		String str,st=N;
		Long ch;
		Pattern p = Pattern.compile("8");
		System.out.println(p);
		for(int i=0;i<K;i++){
			ch=Long.parseUnsignedLong(st,8);
			str=Long.toString(ch,9);
			Matcher m = p.matcher(str);
			if(m != null)
				str=m.replaceAll("5");
			ch=Long.parseUnsignedLong(str);
			st=Long.toString(ch);
			if(i==K-1)
				System.out.println(st);
		}
	}
}

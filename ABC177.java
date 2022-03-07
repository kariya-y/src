import java.util.*;

public class ABC177{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();//書き換え
        String t = sc.nextLine();
        int ans=1001;

        for (int i = 0; i <= s.length()-t.length(); i++) {
            int count=0;
            for (int j = 0; j < t.length(); j++) {

            	System.out.print(t.substring(j,j+1)+"：");
            	System.out.print(s.substring(i+j, i+j+1));
            	System.out.println();
                if(!(t.substring(j,j+1).equals(s.substring(i+j, i+j+1)))) count++;
            }
            System.out.println();

            System.out.println(count);

            if(count<=ans) ans=count;
        }
        System.out.println(ans);
    }
}
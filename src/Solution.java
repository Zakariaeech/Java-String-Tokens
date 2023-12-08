import java.util.*;

public class Solution {

    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            String s = scan.nextLine().trim();
            

            if (s.isEmpty()){
                System.out.println(0);
            }else {
                String []S = s.split("[^A-Za-z0-9]+");
                System.out.println(S.length);
            for (String str : S)
                System.out.println(str); 
            }    
        }
            }   
}

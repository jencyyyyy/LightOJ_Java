package lightoj;

import java.util.ArrayList;
import java.util.Scanner;


public class One1 {
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        ArrayList<Integer> ar = new ArrayList<>();
        
        int a;
        int b;
        
        while(t != 0){
            
            a = in.nextInt();
            ar.add(a);
            t--; 
            }
     
        for (int i = 0; i < ar.size() ; i++) {
             
            if(ar.get(i)>10)
            {
            System.out.println((ar.get(i) - 10) + " "+(ar.get(i) -(ar.get(i)-10)));
 
            }else{
                System.out.println("0 "+ ar.get(i));
            }
        }
        
    }
       
}

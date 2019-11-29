package lightoj;

import java.util.ArrayList;
import java.util.Scanner;

public class One0 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int t = in.nextInt();
        
        while(t != 0){
            
            int a = in.nextInt();
            int b = in.nextInt();
            arr.add(sum(a,b));
            t--; 
            }
     
        for (int i = 0; i < arr.size() ; i++) {
       
            System.out.println("Case " +(i+1) +": " + arr.get(i));
          
        }
        
    }
    
    static int sum(int x, int y){
        return x+y;  
    }
}

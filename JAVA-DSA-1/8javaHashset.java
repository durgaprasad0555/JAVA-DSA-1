import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
     
        Scanner sc = new Scanner(System.in);
           int i=0,k=0;
        int n = sc.nextInt();
        String a = sc.nextLine();
        LinkedHashSet arr = new LinkedHashSet();
        while(i<n)
        {
            if(arr.add(sc.nextLine()))
            {
                k++;
                System.out.println(k);
            }else
            {
                System.out.println(k);
            }
            i++;
        }
      
    }
}


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l[]=new int[n];
        for(int i=0;i<n;i++)
        {
            l[i]=sc.nextInt();
        }
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            al.add(l[i]);
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++)
        {
            String s=sc.next();
            if(s.equals("Insert"))
            {
            int x,y;
            x=sc.nextInt();
            y=sc.nextInt();
            al.add(x,y);
            }
            
            if(s.equals("Delete"))
            {
            int z=sc.nextInt();
            al.remove(z);
            }
            
        }
       
        for(Integer e:al)
        {
            System.out.print(e+" ");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
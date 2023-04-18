import java.io.*;
import java.util.*;

public class Solution {
   
    public static String ispalindrome(String s,int i, int j)
    {
        if(i>=j)
        {
           return "Yes";
        }
        if(s.charAt(i)!=s.charAt(j))
        {
           return "No";
        }
        
      return (ispalindrome(s,i+1,j-1));
        }
        
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int i=0;
        int j=s.length()-1;
        System.out.println(ispalindrome(s,0,s.length()-1));
       
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
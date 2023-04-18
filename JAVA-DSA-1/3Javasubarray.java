import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        int s=0;
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
              int sum=0;
              for(int k=i;k<=j;k++)
              
                  sum=sum+arr[k];
                  if(sum<s)
                  {
                      cnt++;
                  }
              
            }
        }
        System.out.println(cnt);
        
    }
}

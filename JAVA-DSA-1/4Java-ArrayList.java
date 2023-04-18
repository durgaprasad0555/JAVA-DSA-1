import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        ArrayList<ArrayList<Integer>>al = new ArrayList<ArrayList<Integer>>();
   
    
    int n = sc.nextInt();
    for(int i = 0; i<n; i++){
        ArrayList<Integer> al2= new ArrayList<Integer>();
       
        int d = sc.nextInt();
        for(int k = 0;k<d;k++){
            int a = sc.nextInt();
            al2.add(a);
        }
        al.add(al2);
    }
  
    int q = sc.nextInt();
    for(int k = 0; k<q; k++){
        int x, y;
       
        x = sc.nextInt();
        
        y = sc.nextInt();
        try{
           System.out.println(al.get(x-1).get(y-1)); 
        } catch (IndexOutOfBoundsException e){
            System.out.println("ERROR!");
        }
    }
    sc.close();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
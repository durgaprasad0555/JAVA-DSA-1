import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        BitSet bs1=new BitSet(n);
        BitSet bs2=new BitSet(n);
        for(int i=1;i<=m;i++) {

            String str=sc.next();
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(str.equals("AND")) {
                if(a==1) bs1.and(bs2);else bs2.and(bs1); }
            else if(str.equals("OR")) {
                if(a==1) bs1.or(bs2);
                else bs2.or(bs1); }
            else if(str.equals("XOR")) {
                if(a==1) bs1.xor(bs2); else bs2.xor(bs1); }
            else if(str.equals("SET")) {
                if(a==1)  bs1.set(b, true); else bs2.set(b,true);  }
            else if(str.equals("FLIP")) {
                if(a==1) bs1.flip(b); else bs2.flip(b);
            }
            System.out.println(bs1.cardinality()+" "+bs2.cardinality());
        }
    }
}
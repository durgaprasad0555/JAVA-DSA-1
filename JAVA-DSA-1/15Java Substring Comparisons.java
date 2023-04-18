import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String str, int number) {
     String s = ""; String l = "";

    for(int i=0;i<=str.length()-number;i++){
        int range = i + number;
        String subStringI = str.substring(i,range);
        if(subStringI.compareTo(l)>0){
            l=subStringI;
        }
        if(subStringI.compareTo(s)<0){
            s=subStringI;
        }
        if(i==0){
            s=subStringI;
        }
    }
        
        return s + "\n" + l;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
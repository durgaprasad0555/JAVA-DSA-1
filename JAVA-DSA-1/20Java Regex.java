import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        while(sc.hasNext()){
            String ip = sc.next();
            System.out.println(ip.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex {
    String pattern = "((([0-1]?[0-9]{1,2})|(2[0-4][0-9])|(25[0-5]))\\.){3}(([0-1]?[0-9]{1,2})|(2[0-4][0-9])|(25[0-5]))";
}
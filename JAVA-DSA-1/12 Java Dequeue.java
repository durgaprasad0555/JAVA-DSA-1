import java.util.*;
public class test {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        Deque<Integer> d = new ArrayDeque<>();
        HashSet<Integer> s = new HashSet<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            d.add(num);
            s.add(num);
            if(d.size() > m){
                int tmp = d.pop();
                if(!d.contains(tmp)){ s.remove(tmp); }
            }
            if(d.size() == m){
                int Unique = s.size();
                max = (Unique > max) ? Unique : max;
            }
        }
        System.out.println(max);
    }
}
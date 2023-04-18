import java.util.*;

public class Solution {

   public static boolean canWin(int leap, int[] game) {
    return ans( leap, game, 0);    
}

public static boolean ans (int leap, int[] game, int i){
    if ( i >= game.length){
        return true;
    }
    if ( i<0 || game[i] ==1){
        return false;
    }
    game[i] = 1;

    return ans(leap, game, i + leap) || ans(leap, game, i + 1) || ans(leap, game, i - 1);
}

public static void main(String[] args) {
    Scanner ip = new Scanner(System.in);
    int q = ip.nextInt();
    while (q-- > 0) {
        int n = ip.nextInt();
        int leap = ip.nextInt();

        int[] game = new int[n];
        for (int i = 0; i < n; i++) {
            game[i] = ip.nextInt();
        }

        System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
    }
    ip.close();
}
}
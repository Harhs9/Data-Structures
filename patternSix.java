import java.util.*;
public class patternSix {
    public void pattern6(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void main() {
        int N = 4;
        patternSix sol = new patternSix();
        sol.pattern6(N);
    }
}

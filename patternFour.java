import java.util.*;
public class patternFour {
    public void pattern4(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void main() {
        int N = 4;
        patternFour sol = new patternFour();
        sol.pattern4(N);
    }
}

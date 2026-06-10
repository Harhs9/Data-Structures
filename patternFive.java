import java.util.*;
public class patternFive {
    public void pattern5(int n){
        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void main() {
        int N = 4;
        patternFive sol = new patternFive();
        sol.pattern5(N);
    }
}

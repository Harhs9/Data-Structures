import java.util.*;
public class patternTwo {

        public void pattern2(int n) {
            for(int i=0; i<n; i++){
                for(int j=0; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public static void main(String[] args){
            int N = 4;

            patternTwo sol = new patternTwo();
            sol.pattern2(N);
        }
    }

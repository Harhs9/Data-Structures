// WAP to draw the pattern of size n with same rows and columns.

// Code:
import java.util.*;
public class patternOne{
    public void sample_One(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(" "+ "*" + " ");
            }
            System.out.println();
        }
    }
    static void main(String[] args) {
        int N = 10;
       patternOne sol = new patternOne();
            sol.sample_One(N);
    }
}
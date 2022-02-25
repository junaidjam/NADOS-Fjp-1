import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0;i< n;i++){
            for(int j = 0;j<n;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        for(int diag=0;diag<arr.length;diag++){
            int i=0;
            int j=diag;
            
            while(j<n){
                System.out.println(arr[i][j]);
                i++;
                j++;
            }
        }
    }

}
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        for(int i = 0;i<n;i++){
            int min = arr[i][0];
            int colno = 0;
            for(int col = 0;col<n;col++){
                if(arr[i][col]<min){
                    min = arr[i][col];
                    colno = col;
                }
            }
            boolean ans = true;
            for(int row = 0;row<n;row++){
                if(arr[row][colno]>min){
                    ans = false;
                    break;
                }
            }
            if(ans == true){
                System.out.println(min);
                return;
            }
        }
        System.out.println("Invalid input");
    }

}
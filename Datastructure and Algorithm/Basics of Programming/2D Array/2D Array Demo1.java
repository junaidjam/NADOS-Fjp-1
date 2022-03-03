import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int count = 0;
    int[][] arr = new int[n][m];
    int[] arr1 = new int[n*m];
    for(int i = 0;i < arr1.length;i++){
        arr1[i] = scn.nextInt();
    }
    for(int i = 0;i < n;i++){
        for(int j = 0;j < m;j++){
            arr[i][j] = arr1[count];
            count++;
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
 }

}
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int[][] a = new int[n][m];
    for(int i = 0;i<n;i++){
        for(int j = 0;j<m;j++){
            a[i][j] = scn.nextInt();
        }
    }
    for(int j = 0; j<a[0].length;j++){
        if(j % 2 == 0){
            for(int i = 0;i<a.length;i++){
                System.out.println(a[i][j]);
            }
        }else{
            for(int i = n-1;i>=0;i--){
                System.out.println(a[i][j]);
            }
        }
    }
 }

}
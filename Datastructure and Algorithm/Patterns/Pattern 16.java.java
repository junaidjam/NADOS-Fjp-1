import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n = scn.nextInt();
     int i;
     int j;
     for(i = 1;i<=n;i++){
         for(j = 1;j<(2*n);j++){
             if(j<=n){
                 if(j<=i){
                     System.out.print(j + "\t");
                 }
                 else{
                     System.out.print("\t");
                 }
             }
             if(j>n){
                 if(j<(2*n)-i){
                     System.out.print("\t");
                 }
                 else{
                     System.out.print(((2*n)-j) + "\t");
                 }
             }   
         }
         if(i<=n){
         System.out.println();
     }
     }

 }
}
import java.util.*;

public class Main {

  public static void main(String[] args) {
    // Write your code here
    String s = "hello";

    long start = System.currentTimeMillis();
    for(int i = 1;i<=1000;i++){
        s += 'e';
    }  
    long end =  System.currentTimeMillis();

    long duration = end - start;
    System.out.println(duration);
    
    
    StringBuilder s1 = new StringBuilder("hello");

    long start1 = System.currentTimeMillis();
    for(int i = 1;i<=1000;i++){
        s1.append('e');
    }  
    long end1 =  System.currentTimeMillis();

    long duration1 = end1 - start1;
    System.out.println(duration1);

    System.out.println("String VS StringBuilder :- " + duration + " VS " + duration1);
  }
}
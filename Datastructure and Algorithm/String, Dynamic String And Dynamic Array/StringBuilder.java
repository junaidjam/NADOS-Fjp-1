import java.util.*;

public class Main {

  public static void main(String[] args) {
    // Write your code here
    StringBuilder sb = new StringBuilder("hello");
    System.out.println(sb);
    sb.append('e');
    sb.append('b');
    System.out.println(sb);
    
    char ch = sb.charAt(4);
    System.out.println(ch);

    sb.setCharAt(3,'y');
    System.out.println(sb);

    sb.deleteCharAt(4);
    System.out.println(sb);
    
    sb.insert(4,'o');
    System.out.println(sb);

    System.out.println(sb.length());
  }
}
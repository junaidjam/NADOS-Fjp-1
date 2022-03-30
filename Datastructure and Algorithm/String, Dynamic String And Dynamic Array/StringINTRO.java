import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		// String str = scn.next(); //scn.next(); it terminates when it get space.
		
		
		// int a = scn.nextInt();   // it will return integer value only because after that scn.nextline get enter thats why it takes string as empty srting.
		                            // so convert int into string to get both value.
		
		
		int a = Integer.parseInt(scn.nextLine());
		
		String str = scn.nextLine();    //scn.nextLine(); it terminates when it gets enter.
		
		System.out.println(a);
		
		System.out.println(str);
		
		//to get particular character specified index we use str.charAt(index);
		char ch = str.charAt(3);
		System.out.println(ch);

		//to find string length we use str.length();.
		System.out.println(str.length());

		//to get the character in strin in range we use str.substring(start index , last index);.
		//actually last index does not include itself if you want last then you have to right last index+1.
		System.out.println(str.substring(0 , 5));

		//if range is same eg(8,8) it is equivalent to (8,7)
		//last index is prior than first index so if last index is valid then give 
		//elements in range or empty array otherwise if index is not vaid it give error
		System.out.println(str.substring(8 , 8));
		System.out.println(str.substring(9 , 9));
		// System.out.print(str.substring(10 , 10));

	}

}
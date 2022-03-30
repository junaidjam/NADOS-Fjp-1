import java.io.*;
import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

	public static String toggleCase(String str) {
		String ch = "";
		for(int i =0;i< str.length();i++){
			if(Character.isUpperCase(str.charAt(i))){
				char k = Character.toLowerCase(str.charAt(i));
				ch += k;
			}
			else{
				char k = Character.toUpperCase(str.charAt(i));
				ch += k;
			}
		}
		return ch;
	}

}
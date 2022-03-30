import java.io.*;
import java.util.*;

public class Main {

	public static void solution(ArrayList<Integer> al){
		// write your code here
		
	}
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();

		//add
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(2));
		al.set(2,500);
		System.out.println(al);

		al.add(2,1000);
		System.out.println(al);
		
		al.remove(2);
		System.out.println(al);

	}

}
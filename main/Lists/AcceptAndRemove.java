package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AcceptAndRemove {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> a = new ArrayList<String>();
		
		System.out.println("Enter five names:");
		for (int i = 0; i < 5; i++) {
			a.add(sc.next());
		}
		System.out.println(a);
		
		Iterator<String> abc = a.iterator();
		
		while(abc.hasNext()) {
			if(abc.next().toString().length() > 5) {
				abc.remove();
			}
		}
		
		System.out.println(a);
		sc.close();

	}

}

package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PrintSpacialSysmbols {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> a = new ArrayList<String>();
		
		System.out.println("Enter 5 passwords:");
		for (int i = 0; i < 5; i++) {
			a.add(sc.next());
		}
		System.out.println(a);
		
		Iterator<String> abc = a.iterator();
		
		while(abc.hasNext()) {
			String str = abc.next().toString();
			for (int i = 0; i < str.length(); i++) {
				if((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
				}
				else {
					System.out.print(str.charAt(i)+"\n");
				}
			}
		}
		sc.close();
	}

}

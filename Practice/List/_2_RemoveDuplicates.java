package list;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class _2_RemoveDuplicates {
	
	public static ArrayList<Integer> method(ArrayList<Integer> list){
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>(list);
		return new ArrayList<Integer>(set);
	}

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(10);
		a.add(20);
		a.add(40);
		System.out.println(a);
		
		ArrayList<Integer> noDup = method(a);
		System.out.println(noDup);
	}
}

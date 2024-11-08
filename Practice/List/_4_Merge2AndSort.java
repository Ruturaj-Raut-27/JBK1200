package list;

import java.util.ArrayList;
import java.util.TreeSet;

public class _4_Merge2AndSort {

	public static void main(String[] args) {

		ArrayList<Integer> L1 = new ArrayList<Integer>();
		ArrayList<Integer> L2 = new ArrayList<Integer>();
		L1.add(1);
		L1.add(3);
		L1.add(2);
		L2.add(5);
		L2.add(6);
		L2.add(4);

		System.out.println(L1);
		System.out.println(L2);

		for (int num : L2) {
			L1.add(num);
		}
		System.out.println(L1);

		TreeSet<Integer> s = new TreeSet<Integer>(L1);
		L1 = new ArrayList<Integer>(s);
		System.out.println(L1);

//		ArrayList<Integer> L1 = new ArrayList<Integer>();
//		L1.add(1);
//		L1.add(3);
//		L1.add(2);
//		ArrayList<Integer> L2 = new ArrayList<Integer>();
//		L2.add(5);
//		L2.add(6);
//		L2.add(4);
//		
//		System.out.println(L1);
//		System.out.println(L2);
//		
//		L1.addAll(L2);
//		System.out.println(L1);
//		
//		L1.sort(null);
//		System.out.println(L1);
	}

}

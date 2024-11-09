package list;

import java.util.ArrayList;

public class _8_ShiftElements {
	
	public static ArrayList<Integer> change(ArrayList<Integer> al, int shift){
		int size = al.size();
		ArrayList<Integer> s = new ArrayList<Integer>();
		
		for (int i = 0; i < al.size(); i++) {
			s.add(0);
		}
		for (int i = 0; i < size; i++) {
			s.set((i + shift) % size, al.get(i));
		}
		return s;
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		System.out.println(l);
		
		int k = 1;
		
		ArrayList<Integer> i = change(l, k);
		System.out.println(i);
	
	}
}

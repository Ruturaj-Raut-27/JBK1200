package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class _1_SumAndAvg {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Float> a = new ArrayList<Float>();

		System.out.println("how many numbers you need to process:");
		int count = sc.nextInt();

		System.out.println("Enter " + count + " numbers:");
		for (int i = 0; i < count; i++) {
			a.add(sc.nextFloat());
		}
		System.out.println(a);

		float sum = 0;
		Iterator<Float> abc = a.iterator();
		while (abc.hasNext()) {
			sum = sum + abc.next();
		}

		System.out.println("sum: " + sum);
		System.out.println("Average: " + (float)(sum / count));
		sc.close();
	}

}

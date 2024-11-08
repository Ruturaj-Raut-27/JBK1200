package list;

import java.util.ArrayList;

public class _5_MaxMin {

	public static double[] MaxMin(ArrayList<Double> al) {
		if (al.isEmpty()) {
			throw new IllegalArgumentException("The list must not be empty.");
		}
		
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;

		for (double num : al) {
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
		}

		return new double[] { max, min };
	}

	public static void main(String[] args) {

		ArrayList<Double> l = new ArrayList<Double>();
		l.add(12.4);
		l.add(54.67);
		l.add(87.23);
		l.add(68.24);
		System.out.println(l);

		double[] MaxMin = MaxMin(l);
		System.out.println("max: " + MaxMin[0]);
		System.out.println("min: " + MaxMin[1]);

	}

}

package com.mujoko.codility;

import java.util.Arrays;

public class CyclicRotation {

	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 4, 5 };
		int rotation = 1;
		int[] result = solution(input, rotation);
		System.out.println(Arrays.toString(result));
	}

	public static int[] solution(int[] a, int n) {

		int[] copy = new int[a.length];
		System.arraycopy(a, 0, copy, 0, a.length);

		int rotation = n - 1;
		int newIndex;
		for (int i = 1; i <= a.length; i++) {
			newIndex = (i + rotation) % a.length;
			a[newIndex] = copy[i - 1];
		}
		return a;
	}

}

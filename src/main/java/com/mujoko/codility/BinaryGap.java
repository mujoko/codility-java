package com.mujoko.codility;

/**
 * @author mwiyono
 * https://app.codility.com/programmers/lessons/1-iterations/
 */
public class BinaryGap {

	public static void main(String[] args) {
		int result = solution(1025);
		System.out.println(result);
	}

	public static int solution(int n) {

		int longestSeq = 0;
		int currentSeq = 0;
		boolean oneFlag = false;

		String binaryN = Integer.toBinaryString(n);
		System.out.println(binaryN);
		for (char ch : binaryN.toCharArray()) {
			System.out.println(oneFlag);
			if (oneFlag && ch == '0') {
				currentSeq++;
			}
			else if (ch == '1') {

				if (oneFlag) {
					if (currentSeq > longestSeq) {
						longestSeq = currentSeq;
					}
					currentSeq = 0;
				}
				oneFlag = true;
			}
			System.out.println(currentSeq);
		}
		return longestSeq;
	}
}

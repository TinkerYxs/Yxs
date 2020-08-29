package yxs.alibaba;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println(method(s1, s2, n));

	}

	public static long method(String s1, String s2, int n) {
		long res = 0;

		if (s1.length() != s2.length()) {
			return 0;
		} else {

			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			int count1 = 0;
			int count2 = 0;
			for (int i = 0; i < n; i++) {
				if (c1[i] != c2[i]) {
					count1++;
				}
			}
			int k = 0;
			int j = n - 1;
			for (; k < n && j >= 0; k++, j--) {
				if (c1[j] != c2[k]) {
					count2++;
				}
			}
			if (count1 - 1 <= count2) {
				res = count1;

			} else {
				res = count2 + 1;

			}
		}
		return res;
	}
}
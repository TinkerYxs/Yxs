package yxs.alibaba;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		int m = sc.nextInt();

		System.out.println(method(n, m));

	}

	public static long method(long n, int m) {
		long res = 10;
		String s = String.valueOf(n);

		char[] c = s.toCharArray();
		Arrays.sort(c);

		for (int i = 0; i < c.length; i++) {
			if (c[i] != '0') {
				StringBuilder sb = new StringBuilder();
				sb.append(c[i]);

			}
		}

		return res;
	}
}
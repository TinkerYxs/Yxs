package yxs.huawei;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				list.add(Integer.parseInt(sc.next()));
			}
			System.out.println(method(list));
		}

	}

	public static int method(ArrayList<Integer> list) {
		int max = 0;
		for (int i = 0; i < list.size() - 1; i++) {
			int curmax = 1;
			int cur = list.get(i);
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(j) > cur) {

					curmax++;
				}
			}
			if (curmax > max) {
				max = curmax;
				System.out.println(max);
			}
		}
		return max;

	}

}
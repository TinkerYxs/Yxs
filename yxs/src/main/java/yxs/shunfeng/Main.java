package yxs.shunfeng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			sc.nextLine();
			String s = sc.nextLine();
			String[] ss = s.split(" ");
			System.out.println(Arrays.toString(ss));
			ArrayList<Integer> l = new ArrayList<>();
			for (int i = 0; i < ss.length; i++) {
				l.add(Integer.parseInt(ss[i]));
			}
			System.out.println(method(l));

		}

	}

	public static int method(ArrayList list) {
		int res = 2;
		// Random random = new Random();
		// res = random.nextInt(10);
		for (int i = 0; i < list.size(); i++) {

		}
		return res;
	}
}
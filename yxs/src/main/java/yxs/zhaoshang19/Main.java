package yxs.zhaoshang19;

/*
* 思路：
* 1.将区间按照右端大小排列
* 2.如果第一个区间的right<第二个区间的left，说明两个区间没有交集，则第一个区间需要两个数
* 3.
* */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	private static class Line {
		int left, right;

		public Line(int left, int right) {
			this.left = left;
			this.right = right;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		Line[] lines = new Line[n];
		for (int i = 0; i < n; i++) {
			String[] s = bf.readLine().split(" ");
			lines[i] = new Line(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
		}
		int cnt = 2;
		Arrays.sort(lines, 0, n, new cmp());
		int l1 = lines[0].right;
		int l2 = lines[0].right - 1;
		for (int i = 1; i < n; i++) {
			if (l1 < lines[i].left) {
				cnt += 2;
				l1 = lines[i].right;
				l2 = lines[i].right - 1;
			} else if (l1 >= lines[i].left && l1 < lines[i].right && l2 < lines[i].left) {
				cnt += 1;
				l2 = l1;
				l1 = lines[i].right;
			} else if (l1 <= lines[i].right && l2 >= lines[i].left) {
				continue;
			}

		}

		System.out.println(cnt);

	}

	private static class cmp implements Comparator<Line> {
		@Override
		public int compare(Line o, Line k) {
			int t = o.right - k.right;
			if (t == 0) {
				t = k.left - o.left;
			}
			return t;
		}
	}

}
package yxs;

public class Main {
	public static void main(String[] args) {
		// Ai-Aj×î´ó i>j
		int[] arr = { 5, 8, 12, 47, 4, 9, 2, 18, 10, 6, 15, 20 };
		int first = Integer.MAX_VALUE;
		int second = 0;
		for (int j = arr.length - 1; j >= 0; j--) {
			// System.out.print("arr " + j + " :" + arr[j] + " ");
			// System.out.println("first:" + first);
			first = Math.min(first, arr[j]);
			// System.out.print("arr " + j + " :" + arr[j] + " ");
			// System.out.println("first:" + first);
			// System.out.print("second:" + second + " ");
			// System.out.println("arr[j] - first:" + (arr[j] - first));
			second = Math.max(second, arr[j] - first);
			// System.out.println("second:" + second);
		}
		// System.out.println(second);
	}
}
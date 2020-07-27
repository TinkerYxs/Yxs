package yxs;

public class Solution {

	public static void main(String[] arge) {
		System.out.println(movingCount(15, 20, 20));
	}

	public static int movingCount(int threshold, int rows, int cols) {
		int result = 0;

		for (int i = 0; i < rows; i++) {
			int a = shuweiSum(i);

			if (a <= threshold) {
				for (int j = 0; j < cols; j++) {
					int b = shuweiSum(j);

					System.out.println("a+b=" + (a + b) + "     threshold:" + threshold);
					if (a + b > threshold) {
						break;
					} else {
						result++;
					}
				}
			} else {
				break;
			}
		}

		return result;
	}

	public static int shuweiSum(int num) {

		int sum = 0;

		while (num > 10) {
			sum = sum + num % 10;
			num = num / 10;
		}
		sum = sum + num;
		return sum;
	}
}
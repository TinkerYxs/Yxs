/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  bilibili2020num2.java   
 * @Package yxs   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��8��13�� ����5:32:30   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs;

/**   
 * @ClassName:  bilibili2020num2   
 * @Description:TODO(������һ�仰��������������)   
 * @author: Ԫ��˧ 
 * @date:   2020��8��13�� ����5:32:30   
 *     
 * @Copyright: 2020 yxs. All rights reserved. 
 */
import java.util.Scanner;

public class bilibili2020num2 {

	public static int count = 0;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int ai = s.nextInt();
		int m = s.nextInt();
		int[][] M = new int[n][n];

		for (int i = 0; i < m; i++) {
			String string = s.nextLine();
			String[] ms = string.split(",");
			if (ms.length == 2) {
				M[Integer.parseInt(ms[0])][Integer.parseInt(ms[1])] = 1;
				M[Integer.parseInt(ms[1])][Integer.parseInt(ms[0])] = 1;
			}
		}

		method(M, ai);

		System.out.println(count / 2);

	}

	public static void method(int[][] M, int ai) {
		int size = M[0].length;

		for (int i = 0; i < size; i++) {
			if (M[ai][i] == 1) {
				count++;
				method(M, i);
			}
		}

	}

}

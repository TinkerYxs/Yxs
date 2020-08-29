/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  Main2.java   
 * @Package yxs.shunfeng   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年8月29日 下午4:05:09   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.shunfeng;

/**   
 * @ClassName:  Main2   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: 元晓帅 
 * @date:   2020年8月29日 下午4:05:09   
 *     
 * @Copyright: 2020 yxs. All rights reserved. 
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public Main2() {

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		int value = 0;
		int num = 0;

		int x = n / k;

		int y = n % k;
		if (y == 0) {
			num = x;
		} else {
			num = x + 1;
		}
		if (y == 0) {
			for (int i = 0; i < n - x; i = i + x) {
				int sum = 0;
				for (int j = 0; j < x; j++) {
					sum = sum + list.get(i + j);
				}
				value = value + (int) Math.pow(sum, 2);
			}

		} else {
			for (int i = 0; i < y; i = i + x + 1) {
				int sum = 0;
				for (int j = 0; j < x + 1; j++) {
					sum = sum + list.get(i + j);
				}
				value = value + (int) Math.pow(sum, 2);
			}
			for (int i = y; i < n - x; i = i + x) {
				int sum = 0;
				for (int j = 0; j < x; j++) {
					sum = sum + list.get(i + j);
				}
				value = value + (int) Math.pow(sum, 2);
			}
		}

		System.out.println(value + " " + num);
	}

}

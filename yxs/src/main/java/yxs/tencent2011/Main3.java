/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  Main3.java   
 * @Package yxs.tencent2011   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年9月6日 下午9:03:17   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.tencent2011;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName: Main3
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年9月6日 下午9:03:17
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class Main3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(scanner.nextInt());
		}
		for (int i = 0; i < n; i++) {
			int temp = list.get(i);

			list.remove(i);

			int[] res = new int[n - 1];

			for (int j = 0; j < n - 1; j++) {
				res[j] = list.get(j);

			}
			list.add(i, temp);
			Arrays.sort(res);

			System.out.println(res[(n - 1) / 2]);

		}

	}

}

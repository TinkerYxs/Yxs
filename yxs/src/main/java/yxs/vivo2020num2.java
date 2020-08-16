/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  vivo2020num2.java   
 * @Package yxs   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年6月6日 下午5:11:43   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: vivo2020num2
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年6月6日 下午5:11:43
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class vivo2020num2 {

	/**
	 * @Title: vivo2020num2 @Description: TODO(这里用一句话描述这个方法的作用) @param: @throws
	 */
	public vivo2020num2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param: @param args @return:
	 *         void @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(100));
	}

	public static int solution(int n) {
		// write code here
		int res = 1;
		List<Integer> re = new ArrayList<Integer>();
		int num = 0;
		int result = 0;
		int flag = 0;
		int key = n;
		while (flag == 0 && n > 0) {

			int f = 0;
			for (int i = 9; i >= 1; i--) {

				if (n % i == 0) {
					re.add(num, i);
					res = res * re.get(num);
					f = 1;
					break;
				}
			}
			if (f == 0) {
				break;
			} else {

				if (res == key) {
					flag = 1;
					for (int i = 0; i <= num; i++) {

						result = (int) (result + re.get(i) * Math.pow(10, i));

					}
					break;
				} else {
					n = key / res;

					num++;
				}
			}

		}
		if (flag == 0) {
			result = -1;
		}
		String string = new String("222");
		return result;

	}
}

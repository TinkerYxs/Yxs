/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  ali02.java   
 * @Package yxs.alibaba   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年8月28日 下午7:41:18   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.alibaba;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: ali02
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年8月28日 下午7:41:18
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class ali02 {

	/**
	 * @Title: ali02 @Description: TODO(这里用一句话描述这个方法的作用) @param: @throws
	 */
	public ali02() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param: @param args @return:
	 *         void @throws
	 */
	static Set<Long> set = new HashSet<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void allArrayList(char[] array, int start, int m) {
		if (start == array.length) {
			String tmp = String.valueOf(array);
			long tmp1 = Long.valueOf(tmp);
			String tmps = Long.toString(tmp1);
			if (array.length == tmps.length() && tmp1 % m == 0 && !set.contains(tmp1)) {
				set.add(tmp1);

			}
			return;
		} else {
			for (int i = start; i < array.length; ++i) {
				exch(array, start, i);
				allArrayList(array, start + 1, m);
				exch(array, start, i);
			}
		}

	}

	private static void exch(char[] array, int s, int i) {
		char t = array[s];
		array[s] = array[i];
		array[i] = t;
	}

}

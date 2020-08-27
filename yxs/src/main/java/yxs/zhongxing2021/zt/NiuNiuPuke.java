/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  NiuNiuPuke.java   
 * @Package yxs.zhongxing2021.zt   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年8月27日 上午10:37:10   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.zhongxing2021.zt;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @ClassName: NiuNiuPuke
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年8月27日 上午10:37:10
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class NiuNiuPuke {

	/**
	 * @Title: NiuNiuPuke @Description: TODO(这里用一句话描述这个方法的作用) @param: @throws
	 */
	public NiuNiuPuke() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param: @param args @return:
	 *         void @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		ArrayList<String> list3 = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String string = scanner.nextLine();
			String[] strings = string.split(" ");
			list1.add(strings[0]);
			list2.add(strings[1]);
			list3.add(strings[2]);
		}

		System.out.println(method(list1, list2, list3));

	}

	public static int method(ArrayList<String> list1, ArrayList<String> list2, ArrayList<String> list3) {
		int res = 0;

		for (int i = 0; i < list1.size(); i++) {
			for (int j = i + 1; j < list1.size(); j++) {

				for (int k = j + 1; k < list1.size(); k++) {
					if ((list1.get(i).equals(list1.get(j)) && list1.get(j).equals(list1.get(k)))
							|| (!list1.get(i).equals(list1.get(j)) && !list1.get(i).equals(list1.get(k))
									&& !list1.get(j).equals(list1.get(k)))) {
						if ((list2.get(i).equals(list2.get(j)) && list2.get(j).equals(list2.get(k)))
								|| (!list2.get(i).equals(list2.get(j)) && !list2.get(i).equals(list2.get(k))
										&& !list2.get(j).equals(list2.get(k)))) {
							if ((list3.get(i).equals(list3.get(j)) && list3.get(j).equals(list3.get(k)))
									|| (!list3.get(i).equals(list3.get(j)) && !list3.get(i).equals(list3.get(k))
											&& !list3.get(j).equals(list3.get(k)))) {
								res++;
							}
						}
					}

				}
			}
		}
		return res;

	}

}

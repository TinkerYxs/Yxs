/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  Main1.java   
 * @Package yxs.meituan   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年9月6日 上午10:08:04   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.meituan;

import java.util.Scanner;

/**
 * @ClassName: Main1
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年9月6日 上午10:08:04
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class Main1 {

	public static void main(String[] args) {

		/*
		 * Scanner scanner = new Scanner(System.in); long n = scanner.nextLong(); long p
		 * = scanner.nextLong(); long q = scanner.nextLong(); ArrayList<Long> list1 =
		 * new ArrayList<>();
		 * 
		 * int count = 0; for (int i = 0; i < p; i++) { list1.add(scanner.nextLong());
		 * 
		 * } for (int i = 0; i < q; i++) {
		 * 
		 * int x = scanner.nextInt(); for (int j = 0; j < list1.size(); j++) { if (x ==
		 * list1.get(j)) ; count++; } } System.out.println((p - count) + " " + (q -
		 * count) + " " + count);
		 */
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int p = scanner.nextInt();
		int q = scanner.nextInt();
		int[] arr = new int[p];
		int count = 0;
		for (int i = 0; i < p; i++) {
			arr[i] = (scanner.nextInt());
		}
		for (int i = 0; i < q; i++) {
			int x = scanner.nextInt();
			for (int j = 0; j < arr.length; j++) {
				if (x == arr[j]) {
					count++;
				}
			}
		}
		System.out.println((p - count) + " " + (q - count) + " " + count);
	}

}

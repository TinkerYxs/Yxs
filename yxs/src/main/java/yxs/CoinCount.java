/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  CoinCount.java   
 * @Package yxs   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年8月13日 下午7:50:17   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs;

import java.util.Scanner;

/**
 * @ClassName: CoinCount
 * @Description:2020-08-13bilibili笔试题
 * @author: 元晓帅
 * @date: 2020年8月13日 下午7:50:17
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class CoinCount {

	/**
	 * @Title: CoinCount @Description: TODO(这里用一句话描述这个方法的作用) @param: @throws
	 */
	public CoinCount() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param: @param args @return:
	 *         void @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			System.out.println(GetCoinCount(n));
		}

	}

	public static int GetCoinCount(int N) {

		int count = 0;
		if (N >= 1024) {
			return 0;
		} else {
			int m = 1024 - N;
			int count64 = m / 64;
			m = m % 64;
			int count16 = m / 16;
			m = m % 16;
			int count4 = m / 4;
			m = m % 4;
			int count1 = m / 1;
			count = count1 + count4 + count16 + count64;
		}
		return count;
		// write code here
	}
}

/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  AddTwoNum.java   
 * @Package yxs   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年4月6日 下午4:26:29   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @ClassName: AddTwoNum
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年4月6日 下午4:26:29
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class AddTwoNum {

	public volatile int m;

	/**
	 * @Title: AddTwoNum @Description: TODO(这里用一句话描述这个方法的作用) @param: @throws
	 */
	public AddTwoNum() {
		// TODO Auto-generated constructor stub
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode l3 = new ListNode(0);

		ListNode pListNode = new ListNode(0);
		ListNode qListNode = new ListNode(0);
		ListNode rListNode = new ListNode(0);

		pListNode = l1;
		qListNode = l2;
		rListNode = l3;

		int flag = 0;

		while (pListNode != null || qListNode != null) {
			System.out.println(pListNode.val + "   " + qListNode.val);
			if (pListNode.next != null && qListNode.next != null) {
				System.out.println("111111111111111");
				int r = 0;
				if (flag == 0) {
					r = pListNode.val + qListNode.val;
				}
				if (flag == 1) {
					r = pListNode.val + qListNode.val + 1;
				}
				pListNode = pListNode.next;
				qListNode = qListNode.next;
				if (r < 10) {
					flag = 0;
				}
				if (r >= 10) {
					flag = 1;
					r = r - 10;
				}

				rListNode.next = new ListNode(r);
				rListNode = rListNode.next;
			} else if (pListNode.next == null && qListNode.next != null) {
				System.out.println("3333333333333");
				int r = 0;
				if (flag == 0) {
					r = pListNode.val + qListNode.val;

				}
				if (flag == 1) {
					r = pListNode.val + qListNode.val + 1;
				}
				pListNode = pListNode.next;
				qListNode = qListNode.next;
				if (r < 10) {
					flag = 0;
				}
				if (r >= 10) {
					flag = 1;
					r = r - 10;
				}

				rListNode.next = new ListNode(r);
				rListNode = rListNode.next;
				while (qListNode != null) {
					r = 0;
					if (flag == 1) {
						r = qListNode.val + 1;

					}
					if (flag == 0) {
						r = qListNode.val;
					}
					qListNode = qListNode.next;
					if (r < 10) {
						flag = 0;
					}
					if (r >= 10) {
						flag = 1;
						r = r - 10;
					}

					rListNode.next = new ListNode(r);
					rListNode = rListNode.next;

				}
				if (flag == 1) {

					rListNode.next = new ListNode(1);
					rListNode = rListNode.next;
				}

			} else if (pListNode.next != null && qListNode.next == null) {
				System.out.println("44444444444444444");
				int r = 0;
				if (flag == 0) {
					r = pListNode.val + qListNode.val;

				}
				if (flag == 1) {
					r = pListNode.val + qListNode.val + 1;
				}
				pListNode = pListNode.next;
				qListNode = qListNode.next;
				if (r < 10) {
					flag = 0;
				}
				if (r >= 10) {
					flag = 1;
					r = r - 10;
				}

				rListNode.next = new ListNode(r);
				rListNode = rListNode.next;
				while (pListNode != null) {
					r = 0;
					if (flag == 1) {
						r = pListNode.val + 1;

					}
					if (flag == 0) {
						r = pListNode.val;
					}
					pListNode = pListNode.next;
					if (r < 10) {
						flag = 0;
					}
					if (r >= 10) {
						flag = 1;
						r = r - 10;
					}

					rListNode.next = new ListNode(r);
					rListNode = rListNode.next;

				}
				if (flag == 1) {

					rListNode.next = new ListNode(1);
					rListNode = rListNode.next;
				}

			} else if (pListNode.next == null && qListNode.next == null) {

				System.out.println("222222222222222222222");
				int r = 0;
				if (flag == 0) {
					r = pListNode.val + qListNode.val;
				}
				if (flag == 1) {
					r = pListNode.val + qListNode.val + 1;
				}
				if (r < 10) {
					flag = 0;
				}
				if (r >= 10) {
					flag = 1;
					r = r - 10;
				}
				pListNode = pListNode.next;
				qListNode = qListNode.next;
				rListNode.next = new ListNode(r);
				rListNode = rListNode.next;

				if (flag == 1) {

					rListNode.next = new ListNode(1);
					rListNode = rListNode.next;

				}

			}

		}

		return l3.next;
	}

	/**
	 * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param: @param args @return:
	 *         void @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> hashMap = new HashMap<String, String>();

		Set<String> set = new HashSet<String>();

		List<String> l = new ArrayList<String>();

		Hashtable<String, String> h = new Hashtable<String, String>();

		AtomicBoolean boolean1 = new AtomicBoolean();

		AtomicInteger integer = new AtomicInteger();

		AtomicLong long1 = new AtomicLong();

		ArrayList<String> strings = new ArrayList<>();

		String[] strings2 = { "aaa" };
		Arrays.asList(strings2);

		int[] arr = getNumbers();
		long start = System.currentTimeMillis();
		Arrays.sort(arr);
		System.out.println("串行排序时间：" + (System.currentTimeMillis() - start) + " ms");

		arr = getNumbers();
		start = System.currentTimeMillis();
		Arrays.parallelSort(arr);
		System.out.println("并行排序时间：" + (System.currentTimeMillis() - start) + " ms");

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext(".ssss.")) {
			String i = scanner.next(".ssss.");

			System.out.println(i);
		}

	}

	private static int[] getNumbers() {
		int[] arr = new int[5000000];
		Random r = new Random();
		for (int i = 0; i < 5000000; ++i) {
			arr[i] = r.nextInt(1000) + 1;
		}
		return arr;
	}

}

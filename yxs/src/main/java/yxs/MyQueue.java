/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  MyQueue.java   
 * @Package yxs   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��7��15�� ����5:36:19   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs;

/**
 * @ClassName: MyQueue
 * @Description:TODO(������һ�仰��������������)
 * @author: Ԫ��˧
 * @date: 2020��7��15�� ����5:36:19
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class MyQueue {

	private int[] Queue = new int[20];

	private int begin = 0;

	private int end = 0;

	public int getEnd() {

		return this.end - 1;
	}

	public void enQueue(int a) {

		if (end < 20) {

			Queue[end] = a;
			end++;
		} else {
			System.out.println("This Queue is Full!");
		}
	}

	public int getBegin() {

		return this.begin;
	}

	public int deQueue() {

		if (Queue[begin] != Integer.MIN_VALUE) {
			int r = Queue[begin];
			Queue[begin] = Integer.MIN_VALUE;
			begin++;
			if (begin != 0 && begin == end) {
				begin = 0;
				end = 0;
			}
			return r;
		} else {
			System.out.println("This Queue is Empty!");
			return Integer.MIN_VALUE;
		}
	}

	/**
	 * @Title: MyQueue @Description: TODO(������һ�仰�����������������) @param: @throws
	 */
	public MyQueue() {

		for (int i = 0; i < 20; i++) {
			Queue[i] = Integer.MIN_VALUE;
		}
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(������һ�仰�����������������) @param: @param args @return:
	 *         void @throws
	 */
	public static void main(String[] args) {

		MyQueue myQueue = new MyQueue();

		System.out.println(myQueue.getBegin() + "   " + myQueue.getEnd());

		myQueue.enQueue(1);
		myQueue.enQueue(2);
		myQueue.enQueue(3);
		myQueue.enQueue(4);
		myQueue.enQueue(5);
		myQueue.enQueue(6);
		myQueue.enQueue(7);
		myQueue.enQueue(8);
		myQueue.enQueue(9);
		myQueue.enQueue(11);
		myQueue.enQueue(12);

		System.out.println(myQueue.getBegin() + "   " + myQueue.getEnd());
		System.out.println(myQueue.deQueue());
		System.out.println(myQueue.getBegin() + "   " + myQueue.getEnd());
		// TODO Auto-generated method stub

	}

}

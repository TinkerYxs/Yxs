/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  Singleton5.java   
 * @Package yxs.DP.singleton   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��8��31�� ����4:45:20   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.DP.singleton;

/**
 * @ClassName: Singleton5
 * @Description:TODO(������һ�仰��������������)
 * @author: Ԫ��˧
 * @date: 2020��8��31�� ����4:45:20
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
// �Ǽ� ��̬�ڲ���
public class Singleton5 {
	private static class SingletonHolder {
		private static final Singleton5 INSTANCE = new Singleton5();
	}

	private Singleton5() {
	}

	public static final Singleton5 getInstance() {
		return SingletonHolder.INSTANCE;
	}
}

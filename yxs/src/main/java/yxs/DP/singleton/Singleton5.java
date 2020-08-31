/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  Singleton5.java   
 * @Package yxs.DP.singleton   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年8月31日 下午4:45:20   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.DP.singleton;

/**
 * @ClassName: Singleton5
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年8月31日 下午4:45:20
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
// 登记 静态内部类
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

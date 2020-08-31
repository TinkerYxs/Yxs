/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  Singleton4.java   
 * @Package yxs.DP.singleton   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年8月31日 下午4:43:55   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.DP.singleton;

/**
 * @ClassName: Singleton4
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年8月31日 下午4:43:55
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
// 双重检测
public class Singleton4 {
	private volatile static Singleton4 singleton;

	private Singleton4() {
	}

	public static Singleton4 getSingleton() {
		if (singleton == null) {
			synchronized (Singleton4.class) {
				if (singleton == null) {
					singleton = new Singleton4();
				}
			}
		}
		return singleton;
	}
}

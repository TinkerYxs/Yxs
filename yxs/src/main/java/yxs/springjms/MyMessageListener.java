/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  MyMessageListener.java   
 * @Package yxs.springjms   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年8月12日 下午6:04:33   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.springjms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * @ClassName: MyMessageListener
 * @Description:监听器
 * @author: 元晓帅
 * @date: 2020年8月12日 下午6:04:33
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class MyMessageListener implements MessageListener {
	// 监听的message
	@Override
	public void onMessage(Message message) {
		TextMessage textMessage = (TextMessage) message;
		try {
			System.out.println("接收到消息：" + textMessage.getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}

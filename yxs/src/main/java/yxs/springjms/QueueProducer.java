/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  QueueProducer.java   
 * @Package yxs.springjms   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年8月12日 下午5:37:33   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.springjms;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

/**
 * @ClassName: QueueProducer
 * @Description:点对点消息生产者
 * @author: 元晓帅
 * @date: 2020年8月12日 下午5:37:33
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
@Component
public class QueueProducer {
	@Autowired
	private JmsTemplate jmsTemplate;

	@Autowired
	// Destination是接口，queueTextDestination是你配置的实现类的名称
	private Destination queueTextDestination;

	/**
	 * 发送文本消息
	 * 
	 * @param text
	 */
	public void sendTextMessage(final String text) {
		// MessageCreator使用匿名类的方式进行
		jmsTemplate.send(queueTextDestination, new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(text);
			}
		});
	}

}

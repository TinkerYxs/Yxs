/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  TopicProducer.java   
 * @Package yxs.springjms   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年8月12日 下午8:45:51   
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
 * @ClassName: TopicProducer
 * @Description:发布订阅消息生产者
 * @author: 元晓帅
 * @date: 2020年8月12日 下午8:45:51
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
@Component
public class TopicProducer {

	@Autowired
	private JmsTemplate jmsTemplate;

	@Autowired
	private Destination topicTextDestination;

	/**
	 * 发送文本消息
	 * 
	 * @param text
	 */
	public void sendTextMessage(final String text) {
		jmsTemplate.send(topicTextDestination, new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException, JMSException {
				return session.createTextMessage(text);
			}
		});
	}

}

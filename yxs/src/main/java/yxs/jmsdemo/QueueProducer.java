/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  QueueProducer.java   
 * @Package yxs.jmsdemo   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年8月12日 下午8:10:30   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.jmsdemo;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

/**
 * @ClassName: QueueProducer
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年8月12日 下午8:10:30
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class QueueProducer {
	public static void main(String[] args) throws JMSException {

		// 1.创建连接工厂
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://127.0.0.1:61616");
		// 2.获取连接
		Connection connection = connectionFactory.createConnection();
		// 3.启动连接
		connection.start();
		// 4.获取session (参数1：是否启动事务,参数2：消息确认模式)
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		// 5.创建队列对象
		Queue queue = session.createQueue("test-queue");
		// 6.创建消息生产者
		MessageProducer producer = session.createProducer(queue);
		// 7.创建消息
		TextMessage textMessage = session.createTextMessage("欢迎来到神奇的世界");
		// 8.发送消息
		producer.send(textMessage);
		// 9.关闭资源
		producer.close();
		session.close();
		connection.close();
	}

}
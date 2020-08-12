/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  TestTopicConsumer.java   
 * @Package yxs.springjms   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年8月12日 下午8:50:23   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.springjms;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName: TestTopicConsumer
 * @Description:测试发布订阅消费者
 * @author: 元晓帅
 * @date: 2020年8月12日 下午8:50:23
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/yxs/springjms/applicationContext-jms-consumer-topic.xml")
public class TestTopicConsumer {

	@Test
	public void testTopicQueue() {
		// TODO Auto-generated method stub
		try {
			// 为了启动进行监听
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

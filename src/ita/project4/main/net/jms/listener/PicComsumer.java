package ita.project4.main.net.jms.listener;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import ita.project4.main.po.Food;
import ita.project4.main.service.FoodService;
import ita.project4.main.util.JsonUtils;

public class PicComsumer implements MessageListener {

	private static final Logger LOGGER = LoggerFactory.getLogger(PicComsumer.class);

	private JmsTemplate picJMSTemplate;
	
	@Autowired
	private FoodService foodService;

	public JmsTemplate getPicJMSTemplate() {
		return picJMSTemplate;
	}

	public void setPicJMSTemplate(JmsTemplate picJMSTemplate) {
		this.picJMSTemplate = picJMSTemplate;
	}

	@Override
	public void onMessage(Message message) {
		if (message instanceof TextMessage) {
			TextMessage textMessage = (TextMessage) message;
			try {
				final String request = textMessage.getText();
				LOGGER.info(request);
				System.out.println(request);
				Food food = JsonUtils.toObject(request, Food.class);
				food.setfStatus(2);
				foodService.saveFood(food);
//				Destination destination = textMessage.getJMSReplyTo();
//				final String jmsCorrelationID = textMessage.getJMSCorrelationID();
//				jmsTemplate.send(destination, new MessageCreator() {
//
//					@Override
//					public Message createMessage(Session session) throws JMSException {
//						Message msg = session.createTextMessage(request + "的应答！");
//						msg.setJMSCorrelationID(jmsCorrelationID);
//						return msg;
//					}
//				});
			} catch (JMSException e) {
				LOGGER.error("接收信息出错", e);
			}
		}
	}

}

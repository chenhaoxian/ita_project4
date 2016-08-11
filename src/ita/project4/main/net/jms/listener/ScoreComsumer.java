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

import ita.project4.main.service.MerchantService;

public class ScoreComsumer implements MessageListener {

	private static final Logger LOGGER = LoggerFactory.getLogger(ScoreComsumer.class);

	private JmsTemplate scoreJMSTemplate;
	
	@Autowired
	private MerchantService merchantService;

	public JmsTemplate getScoreJMSTemplate() {
		return scoreJMSTemplate;
	}

	public void setScoreJMSTemplate(JmsTemplate scoreJMSTemplate) {
		this.scoreJMSTemplate = scoreJMSTemplate;
	}

	@Override
	public void onMessage(Message message) {
		if (message instanceof TextMessage) {
			TextMessage textMessage = (TextMessage) message;
			try {
				final String request = textMessage.getText();
				LOGGER.info(request);
				System.out.println(request);
				int reqInt = Integer.parseInt(request);
				merchantService.updateMerchantStatus(reqInt, 4);
			} catch (JMSException e) {
				LOGGER.error("接收信息出错", e);
			}
		}
	}

}

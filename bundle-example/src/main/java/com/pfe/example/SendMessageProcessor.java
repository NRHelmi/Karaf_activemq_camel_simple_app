package com.pfe.example;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SendMessageProcessor implements Processor{

	private static final Logger logger = LoggerFactory.getLogger(SendMessageProcessor.class);

	
	public void process(Exchange arg0) throws Exception {
		// TODO Auto-generated method stub
		logger.info("Jms message received (just for info): "+arg0.getIn().getBody());
		logger.warn("In case of Warning: "+arg0.getIn().getBody());
		logger.error("In case of Error: "+arg0.getIn().getBody());
		logger.debug("In case of Debug: "+arg0.getIn().getBody());
		
		arg0.getIn().setBody("Edited jms message: "+arg0.getIn().getBody());
	}
	
}

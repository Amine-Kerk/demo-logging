package dev.console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.service.AppService;

public class App {

	private static final Logger LOG = LoggerFactory.getLogger(App.class);
	
	
	public static void main(String[] args) {
		
		LOG.info("Bonjour Slf4J !");
		LOG.info("Implementation Logback");

	new AppService().executer("bonjour 1");
	new AppService().executer("bonjour 2");
	new AppService().executer("bonjour 3");
	new AppService().executer("bonjour 4");


	
	
		
		
		
		
	
		
		

	}

}

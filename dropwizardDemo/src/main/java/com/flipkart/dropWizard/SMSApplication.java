package com.flipkart.dropWizard;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.flipkart.rest.AdminRestController;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;


//Application class starting point need to extend Application class of dropwizard
public class SMSApplication extends Application<Configuration>
{
	//slf4j logger
	 private static final Logger logger = LoggerFactory.getLogger(SMSApplication.class);
	 
	 //prepare runtime environment
	 @Override
	    public void initialize(Bootstrap<Configuration> b) {
	    }
	 
	    //run method prepare runtime environment
	    @Override
	    public void run(Configuration c, Environment e) throws Exception {
	        logger.info("Registering REST resources");
	        //registering controller to jersey in dropwizard environemt
	        e.jersey().register(new AdminRestController());
	    }
	 
	    //main method
	    public static void main(String[] args) throws Exception {
	    	new SMSApplication().run(args);
	    }
}

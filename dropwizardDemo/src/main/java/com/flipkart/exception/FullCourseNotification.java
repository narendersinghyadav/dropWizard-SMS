package com.flipkart.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Notification class
public class FullCourseNotification extends Exception{
	private static final Logger logger = LoggerFactory.getLogger(FullCourseNotification.class);

	private int courseid;
	public FullCourseNotification(int courseid) {
		this.courseid = courseid;
	}
	//Display notification message
	public void displayMessage() {
		logger.error(courseid+" course is full");
	}
}

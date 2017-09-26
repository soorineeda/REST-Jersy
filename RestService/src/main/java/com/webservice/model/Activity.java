package com.webservice.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author nuggu
 *
 */
@SuppressWarnings("serial")
@XmlRootElement
public class Activity implements Serializable {
	private String activityName;
	private int duration;

	public Activity(final String activityName, final int duration) {
		this.activityName = activityName;
		this.duration = duration;
	}

	public Activity() {
	}

	@XmlElement
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	@XmlElement
	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getActivityName() {
		return activityName;
	}

	public int getDuration() {
		return duration;
	}

}

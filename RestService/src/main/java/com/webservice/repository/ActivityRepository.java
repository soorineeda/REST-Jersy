package com.webservice.repository;

import java.util.List;

import com.webservice.model.Activity;

public interface ActivityRepository {
	List<Activity> retrievAllActivities();
}
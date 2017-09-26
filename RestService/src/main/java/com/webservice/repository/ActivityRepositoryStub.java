package com.webservice.repository;

import java.util.ArrayList;
import java.util.List;

import com.webservice.model.Activity;

/**
 * @author nuggu
 *
 */
public class ActivityRepositoryStub implements ActivityRepository {

	public List<Activity> retrievAllActivities() {
		List<Activity> activities = new ArrayList<>();
		Activity activity = new Activity();
		activity.setActivityName("Running");
		activity.setDuration(15);
		activities.add(activity);
		return activities;
	}
}

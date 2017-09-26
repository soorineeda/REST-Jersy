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
		final List<Activity> activities = new ArrayList<>();
		final Activity activity = new Activity("Running", 15);
		final Activity activity2 = new Activity();
		activity2.setActivityName("walking");
		activity.setDuration(15);
		activities.add(activity);
		activities.add(activity2);
		return activities;
	}
}

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
		final Activity activity = new Activity("Running",15);
		activities.add(activity);
		return activities;
	}
}

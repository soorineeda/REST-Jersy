package com.webservice.RestService;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.webservice.model.Activity;
import com.webservice.repository.ActivityRepository;
import com.webservice.repository.ActivityRepositoryStub;

/**
 * @author nuggu
 *
 */
@Path("activities")
public class ActivityService {
	private ActivityRepository activityRepo = new ActivityRepositoryStub();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Activity> getAllActivities() {
		return activityRepo.retrievAllActivities();
	}
}

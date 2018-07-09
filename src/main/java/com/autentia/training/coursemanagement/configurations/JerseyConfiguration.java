package com.autentia.training.coursemanagement.configurations;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.logging.LoggingFeature;
//import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
//import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.context.annotation.Configuration;

//import com.autentia.courseManagement.web.filter.CORSResponseFilter;
//import com.autentia.courseManagement.web.resource.CourseResource;
//import com.autentia.courseManagement.web.resource.FileDownloadResource;
//import com.autentia.courseManagement.web.resource.FileUploadResource;
//import com.autentia.courseManagement.web.resource.LevelResource;
//import com.autentia.courseManagement.web.resource.TeacherResource;

@Configuration 
@ApplicationPath("/rest")
public class JerseyConfiguration extends ResourceConfig {

	public JerseyConfiguration() {
//		register(LevelResource.class);
//		register(TeacherResource.class);
//		register(CourseResource.class);
//		register(FileUploadResource.class);
//		register(FileDownloadResource.class);
		packages("com.autentia.training.coursemanagement.web.resources");


//		register(CORSResponseFilter.class);
//		property(ServletProperties.FILTER_FORWARD_ON_404, true);
//		register(MultiPartFeature.class);
		register(LoggingFeature.class);
	}


}

package com.autentia.training.coursemanagement.web.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.lang3.SerializationUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.autentia.training.coursemanagement.model.entities.Course;
import com.autentia.training.coursemanagement.model.exceptions.EntityNotFoundException;
import com.autentia.training.coursemanagement.model.services.CourseService;

/**
 * Servicio REST para la gestión de la entidad 'Course'
 * @author Autentia
 * @version 1.0
 */
@Component
@Path("/course")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CourseResource {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	private CourseService courseService;
	
    public CourseResource(CourseService courseService) {
        this.courseService = courseService;
    }
    
	@POST
	public Response create(Course course) {
		if(course.getTitle() == null || course.getLevel() == null || course.getTeacher() == null || course.getState() == null) {
			return Response.status(500).entity("Falta por rellenar campos obligatorios").build();
		}
		return Response.ok().entity(courseService.create(course)).build();
	}
    
    @GET
    public Response getAll() {
        return Response.ok().entity(courseService.findAll()).build();
    }

	@GET
	@Path("/{id}")
	public Response get(@PathParam("id") Long id) {
		Course course = null;
		try {
			course = courseService.findOne(id);
			log.debug(course.toString());
			log.debug(""+course.equals(SerializationUtils.clone(course)));
		} catch (EntityNotFoundException e) {
			log.error(e.getMessage());
			return Response.status(404).build();
		}
		return Response.ok().entity(course).build();
    }

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") Long id, Course course) {
    	Course courseUpdated = null;
    	try {
    		if(course.getTitle() == null || course.getLevel() == null || course.getTeacher() == null || course.getState() == null) {
    			return Response.status(500).entity("Falta rellenar campos obligatorios").build();
    		}
    		courseUpdated = courseService.update(id, course);
		} catch (EntityNotFoundException e) {
			log.error(e.getMessage());
			return Response.status(404).build();
		}
		return Response.ok().entity(courseUpdated).build();
    }
    
    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Long id) {
    	try {
			courseService.delete(id);
		} catch (EntityNotFoundException e) {
			log.error(e.getMessage());
			return Response.status(404).build();
		}
        return Response.ok().entity("Curso eliminado con éxito!").build();
    }
}

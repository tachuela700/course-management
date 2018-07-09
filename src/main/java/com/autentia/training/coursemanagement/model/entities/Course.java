package com.autentia.training.coursemanagement.model.entities;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Entidad para la gestión de los cursos
 * @author Autentia
 * @version 1.0
 */
public class Course implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Identificador del curso
	 */
	private Long id;

	/**
	 * Titulo del curso
	 */
	private String title;

	/**
	 * Nivel del curso
	 */
	private String level;

	/**
	 * Número de horas del curso
	 */
	private Integer numberOfHours;

	/**
	 * Profesor del curso
	 */
	private String teacher;

	/**
	 * Estado del curso
	 */
	private Boolean state;

	/**
	 * Devuelve el identificador del curso
	 * @return id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Establece el identificador del curso
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Devuelve el título del curso
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Establece el título del curso
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Devuelve el nivel del curso
	 * @return level
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * Establece el nivel del curso
	 * @param levelId
	 */
	public void setLevel(String level) {
		this.level = level;
	}

	/**
	 * Devuelve el número de horas del curso
	 * @return numberOfHours
	 */
	public Integer getNumberOfHours() {
		return numberOfHours;
	}

	/**
	 * Establece el número de horas del curso
	 * @param numberOfHours
	 */
	public void setNumberOfHours(Integer numberOfHours) {
		this.numberOfHours = numberOfHours;
	}

	/**
	 * Devuelve el profesor del curso
	 * @return the teacher
	 */
	public String getTeacher() {
		return teacher;
	}

	/**
	 * Establece el profesor del curso
	 * @param teacher
	 */
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	/**
	 * Devuelve el estado del curso
	 * @return the state
	 */
	public Boolean getState() {
		return state;
	}

	/**
	 * Establece el estado del curso
	 * @param state
	 */
	public void setState(Boolean state) {
		this.state = state;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}


}

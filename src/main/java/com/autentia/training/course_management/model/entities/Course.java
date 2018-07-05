package com.autentia.training.course_management.model.entities;

import java.io.Serializable;

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
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((level == null) ? 0 : level.hashCode());
		result = prime * result + ((numberOfHours == null) ? 0 : numberOfHours.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((teacher == null) ? 0 : teacher.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Course)) {
			return false;
		}
		Course other = (Course) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (level == null) {
			if (other.level != null) {
				return false;
			}
		} else if (!level.equals(other.level)) {
			return false;
		}
		if (numberOfHours == null) {
			if (other.numberOfHours != null) {
				return false;
			}
		} else if (!numberOfHours.equals(other.numberOfHours)) {
			return false;
		}
		if (state == null) {
			if (other.state != null) {
				return false;
			}
		} else if (!state.equals(other.state)) {
			return false;
		}
		if (teacher == null) {
			if (other.teacher != null) {
				return false;
			}
		} else if (!teacher.equals(other.teacher)) {
			return false;
		}
		if (title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!title.equals(other.title)) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.getClass().getSimpleName());
		builder.append(" [");
		if (id != null) {
			builder.append("id=");
			builder.append(id);
			builder.append(", ");
		}
		if (title != null) {
			builder.append("title=");
			builder.append(title);
			builder.append(", ");
		}
		if (level != null) {
			builder.append("level=");
			builder.append(level);
			builder.append(", ");
		}
		if (numberOfHours != null) {
			builder.append("numberOfHours=");
			builder.append(numberOfHours);
			builder.append(", ");
		}
		if (teacher != null) {
			builder.append("teacher=");
			builder.append(teacher);
			builder.append(", ");
		}
		if (state != null) {
			builder.append("state=");
			builder.append(state);
		}
		builder.append("]");
		return builder.toString();
	}


}

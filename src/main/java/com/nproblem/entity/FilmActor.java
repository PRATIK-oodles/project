package com.nproblem.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "filmactor", schema = "public")
public class FilmActor implements Serializable {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "filmid", nullable = false, insertable = false, updatable = false)
	private Film film;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "actorid", nullable = false, insertable = false, updatable = false)
	private Actor actor;

}

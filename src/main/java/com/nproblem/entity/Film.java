package com.nproblem.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "film", schema = "public")
public class Film implements Serializable {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "languageid", nullable = false)
	private Language language;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "film")
	private Set<FilmActor> filmActors;

}

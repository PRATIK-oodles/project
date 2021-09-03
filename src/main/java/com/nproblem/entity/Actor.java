package com.nproblem.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "actor", schema = "public")
public class Actor implements Serializable {
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "actor")
	private Set<FilmActor> filmActors;

}

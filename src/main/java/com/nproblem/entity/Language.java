package com.nproblem.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "language", schema = "public")
public class Language implements Serializable {
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "language")
	private Set<Film> films;

}

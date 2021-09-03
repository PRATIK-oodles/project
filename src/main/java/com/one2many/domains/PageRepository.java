package com.one2many.domains;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort;

public interface PageRepository extends CrudRepository<Page, Long> {

	List<Page> findByBook(Book book, Sort sort);
}

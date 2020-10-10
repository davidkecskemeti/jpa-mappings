package com.dk.jpa.mappings.one2many.repository;

import com.dk.jpa.mappings.one2many.entity.Book;
import com.dk.jpa.mappings.one2many.entity.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PageRepository extends CrudRepository<Page, Long> {

    List<Page> findByBook(Book book, Sort sort);
}

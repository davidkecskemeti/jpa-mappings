package com.dk.jpa.mappings.one2many.repository;

import com.dk.jpa.mappings.one2many.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

    Book findByIsbn(String isbn);
}

package com.angello.spring5webapp.repositories;

import com.angello.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 5/16/17.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}

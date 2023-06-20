package com.cjc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}

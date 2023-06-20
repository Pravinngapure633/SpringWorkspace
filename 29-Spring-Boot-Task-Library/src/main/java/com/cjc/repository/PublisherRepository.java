package com.cjc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Publisher;
@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Integer> {

}

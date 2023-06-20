package com.cjc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.cjc.dto.OrderResponse;
import com.cjc.model.Customer;


@Repository
@EnableJpaRepositories
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	@Query("SELECT new com.cjc.dto.OrderResponse(c.cname,p.pname,p.price) FROM Customer c JOIN c.pList p")
	public List<OrderResponse> getJoinInformation1();

	@Query("SELECT new com.cjc.dto.OrderResponse(c.cname,p.pname)" + "FROM Customer c RIGHT JOIN c.pList p")
	public List<OrderResponse> getJoinInformation2();

	@Query("SELECT new com.cjc.dto.OrderResponse(c.cname,p.pname)"+ "FROM Customer c LEFT JOIN c.pList p")
	public List<OrderResponse> getLeftJoin();

	@Query("SELECT new com.cjc.dto.OrderResponse(c.cname,p.pname)"+ "FROM Customer c INNER JOIN c.pList p")
	public List<OrderResponse> getInnerJoin();
}


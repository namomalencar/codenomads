package com.codenomads.mylistapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codenomads.mylistapp.domain.ListDomain;

@Repository
public interface ListRepository extends JpaRepository<ListDomain, Long>{

}

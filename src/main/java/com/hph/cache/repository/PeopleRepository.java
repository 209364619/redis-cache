package com.hph.cache.repository;

import com.hph.cache.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface PeopleRepository extends JpaRepository<People, Integer> {
}

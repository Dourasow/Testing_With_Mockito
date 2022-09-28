package com.testingPractice.sow;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    public Long countById(Integer id);
}

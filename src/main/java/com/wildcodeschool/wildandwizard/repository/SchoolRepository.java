package com.wildcodeschool.wildandwizard.repository;


import org.springframework.stereotype.Repository;
import com.wildcodeschool.wildandwizard.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {
}

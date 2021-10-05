package com.people.todolist.infrastructure.repository;


import com.people.todolist.infrastructure.entity.Gender;
import com.people.todolist.utils.enumeration.GenderEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GenderRepository extends JpaRepository<Gender, Integer> {
    Gender findGenderById(Integer id);

    @Override
    Optional<Gender> findById(Integer integer);

    Gender findByGender(GenderEnum genderEnum);
}


